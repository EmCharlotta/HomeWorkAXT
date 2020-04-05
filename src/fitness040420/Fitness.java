package fitness040420;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Fitness {

    private Visitor[] visitorsPool = new Visitor[20];
    private Visitor[] visitorsTrain = new Visitor[20];
    private Visitor[] visitorsGroup = new Visitor[20];
    Pool pool1;
    TrainZone train1;
    GroupZone grZone1;
    Single single;
    FullDay fullDay;
    DayTime dayTime;


    public Pool getPool1() {
        return pool1;
    }

    public void setPool1(Pool pool1) {
        this.pool1 = pool1;
    }

    public TrainZone getTrain1() {
        return train1;
    }

    public void setTrain1(TrainZone train1) {
        this.train1 = train1;
    }

    public GroupZone getGrZone1() {
        return grZone1;
    }

    public void setGrZone1(GroupZone grZone1) {
        this.grZone1 = grZone1;
    }

    public Visitor[] getVisitorsPool() {
        return visitorsPool;
    }

    public void setVisitorsPool(Visitor[] visitorsPool) {
        this.visitorsPool = visitorsPool;
    }

    public Visitor[] getVisitorsTrain() {
        return visitorsTrain;
    }

    public void setVisitorsTrain(Visitor[] visitorsTrain) {
        this.visitorsTrain = visitorsTrain;
    }

    public Visitor[] getVisitorsGroup() {
        return visitorsGroup;
    }

    public void setVisitorsGroup(Visitor[] visitorsGroup) {
        this.visitorsGroup = visitorsGroup;
    }

    private void addVisitorPool(Visitor newVisitor) {
        int flag = 0;
        for (int i = 0; i < visitorsPool.length; i++) {
            if (visitorsPool[i] == null) {
                visitorsPool[i] = newVisitor;
                flag++;
                visitorsPool[i].setVisitedArea(pool1);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Все места в бассейне сейчас заняты, подойдите попозже");
        }
        else
            System.out.println("Добро пожаловать в клуб!");
    }

    private void addVisitorTrain(Visitor newVisitor) {
        int flag = 0;
        for (int i = 0; i < visitorsTrain.length; i++) {
            if (visitorsTrain[i] == null) {
                visitorsTrain[i] = newVisitor;
                flag++;
                visitorsTrain[i].setVisitedArea(train1);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Все места в тренажерном зале сейчас заняты, подойдите попозже");
        }
        else
            System.out.println("Добро пожаловать в клуб!");
    }

    private void addVisitorGroup(Visitor newVisitor) {
        int flag = 0;
        for (int i = 0; i < visitorsGroup.length; i++) {
            if (visitorsGroup[i] == null) {
                visitorsGroup[i] = newVisitor;
                flag++;
                visitorsGroup[i].setVisitedArea(grZone1);
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Все места в групповом зале сейчас заняты, подойдите попозже");
        }
        else
            System.out.println("Добро пожаловать в клуб!");
    }

    public void leaveVisitor(Visitor leavingVisitor) {
        if (leavingVisitor.getVisitedArea() == grZone1) {
            for (int i = 0; i < visitorsGroup.length; i++) {
                if (visitorsGroup[i] == leavingVisitor) {
                    visitorsGroup[i] = null;
                }
            }
        } else if (leavingVisitor.getVisitedArea() == pool1) {
            for (int i = 0; i < visitorsPool.length; i++) {
                if (visitorsPool[i] == leavingVisitor) {
                    visitorsPool[i] = null;
                }
            }
        }
    }

    public void access (Visitor visitor) {
        if (visitor.getSubscription().getStartDate().minusDays(1).isBefore(LocalDate.now())
                && visitor.getSubscription().getEndDate().plusDays(1).isAfter(LocalDate.now())) {
            switch (visitor.getSubscription().getSubType()) {
                case ("Разовый"):
                    if (LocalTime.now().isAfter(LocalTime.of(22,00))
                            || LocalTime.now().isBefore(LocalTime.of(8,00))) {
                        System.out.println("Время действия абонемента не совпадает с текущим временем");
                    }
                    else
                        accessZone(visitor);
                    break;
                case ("Дневной"):
                    if (LocalTime.now().isAfter(LocalTime.of(16,00))) {
                        System.out.println("Время действия абонемента не совпадает с текущим временем");
                    }
                    else if ( LocalTime.now().isBefore(LocalTime.of(8,00))){
                    System.out.println("Время действия абонемента не совпадает с текущим временем");
                }
                    else
                        accessZone(visitor);
                    break;
                case ("Полный"):
                    if (LocalTime.now().isAfter(LocalTime.of(22,00))
                            || LocalTime.now().isBefore(LocalTime.of(8,00))) {
                        System.out.println("Время действия абонемента не совпадает с текущим временем");
                    }
                    else  accessZone(visitor);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + visitor.getSubscription().getSubType());
            }
        } else
            System.out.println("Ваш абонемент сегодня недействителен");
    }

    private void accessZone(Visitor visitor) {
        System.out.println("Введите зону, желаемую к посещению");
        Scanner scan = new Scanner(System.in);
        String zone = scan.nextLine();
        switch (visitor.getSubscription().getSubType()) {
            case ("Дневной"):
                if (zone.equals("Бассейн")) {
                    System.out.println("К сожалению, по дневному абонементу вход в бассейн запрещен");
                } else if (zone.equals("Групповые занятия")) {
                    addVisitorGroup(visitor);
                } else if (zone.equals("Тренажерный зал")) {
                    addVisitorTrain(visitor);
                }
                break;
            case ("Разовый"):
                if (zone.equals("Групповые занятия")) {
                    System.out.println("К сожалению, по разовому абонементу вход на групповые занятия запрещен");
                } else if (zone.equals("Тренажерный зал")) {
                    addVisitorTrain(visitor);
                } else if (zone.equals("Бассейн")) {
                    addVisitorPool(visitor);
                }
                break;
            case ("Полный"):
                if (zone.equals("Тренажерный зал")) {
                    addVisitorTrain(visitor);
                } else if (zone.equals("Бассейн")) {
                    addVisitorPool(visitor);
                } else if (zone.equals("Групповые занятия")) {
                    addVisitorGroup(visitor);
                    break;
                }

        }
    }
    public void endDay(){
        for (Visitor visitor:visitorsPool) {
            visitor = null;
        }
        for (Visitor visitor:visitorsTrain) {
            visitor = null;
        }
        for (Visitor visitor:visitorsGroup) {
            visitor = null;
        }
    }

}

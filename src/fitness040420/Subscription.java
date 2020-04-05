package fitness040420;

import java.time.LocalDate;

public class Subscription {

    private LocalDate startDate;
    private LocalDate endDate;
    private String subType;

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        if(subType.equals("Разовый")|| subType.equals("Дневной") ||subType.equals("Полный")){
            this.subType = subType;
        }
        else{
            System.out.println("Введите корректный тип абонемента");
        }
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}

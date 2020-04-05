package fitness040420;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fitness fitness1 = new Fitness();
        Visitor visitor1 = new Visitor();
        Visitor visitor2 = new Visitor();
        Pool pool1 = new Pool();
        TrainZone trainZone1 = new TrainZone();
        GroupZone groupZone1 = new GroupZone();
        fitness1.setGrZone1(groupZone1);
        fitness1.setPool1(pool1);
        fitness1.setTrain1(trainZone1);
        Subscription subscription = new Subscription();
        subscription.setSubType("Разовый");
        subscription.setStartDate(LocalDate.of(2019,02,01));
        subscription.setEndDate(LocalDate.of(2020,04,05));
        visitor1.setSubscription(subscription);
        fitness1.access(visitor1);


    }
}

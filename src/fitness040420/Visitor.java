package fitness040420;

import java.time.LocalDate;

import static java.time.LocalDate.of;

public class Visitor {
    private String name;
    private String surname;
    private Gym visitedArea;
    private LocalDate birthDate;
    private Subscription subscription;

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gym getVisitedArea() {
        return visitedArea;
    }

    public void setVisitedArea(Gym visitedArea) {
        this.visitedArea = visitedArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", visitedArea='" + visitedArea + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", subscription='" + subscription + '\'' +
                '}';
    }
}

package hw170420.enumm;

public class User {

    String fulName;
    int salary;
    Position position;

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "User{" +
                "fulName='" + fulName + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }

    public void setPosition(Position position) {
        this.position = position;

    }
}
enum Position{
    ASSISTANT, EMPLOYEE, SENIOR_ACCOUNTANT, HEAD;
}

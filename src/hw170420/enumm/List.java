package hw170420.enumm;

import java.util.Arrays;
import java.util.Scanner;

public class List {
    private User[] assistants = new User[10];
    private User[] employees = new User[10];
    private User[] seniorAccountants = new User[5];
    private User[] heads = new User[3];

    public User[] getAssistants() {
        return assistants;
    }

    public void setAssistants(User[] assistants) {
        this.assistants = assistants;
    }

    public User[] getEmployees() {
        return employees;
    }

    public void setEmployees(User[] employees) {
        this.employees = employees;
    }

    public User[] getSeniorAccountants() {
        return seniorAccountants;
    }

    public void setSeniorAccountants(User[] seniorAccountants) {
        this.seniorAccountants = seniorAccountants;
    }

    public User[] getHeads() {
        return heads;
    }

    public void setHeads(User[] heads) {
        this.heads = heads;
    }

    public void input(User user) {
        System.out.println("Введите имя и фамилию");
        Scanner scan = new Scanner(System.in);
        String fulName = scan.nextLine();
        user.setFulName(fulName);
        System.out.println("Введите первую заглавную букву позиции");
        Scanner scanP = new Scanner(System.in);
        String position = scan.nextLine();
        if (position.startsWith("A")) {
            user.setPosition(Position.ASSISTANT);
            int flag = 0;
            for (int i =0; i<assistants.length;i++) {
                if (assistants[i] == null) {
                    assistants[i] = user;
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Список переполнен, не могу вас внести");
            }
        }
        else if (position.startsWith("E")) {
            user.setPosition(Position.EMPLOYEE);
            int flag = 0;
            for (int i=0;i<employees.length;i++) {
                if (employees[i] == null) {
                    employees[i] = user;
                    flag++;
                    break;                }

            }
            if (flag == 0) {
                System.out.println("Список переполнен, не могу вас внести");
            }
        }
        else if (position.startsWith("S")) {
            user.setPosition(Position.SENIOR_ACCOUNTANT);
            int flag = 0;
            for (int i=0; i<seniorAccountants.length;i++) {
                if (seniorAccountants[i] == null) {
                    seniorAccountants[i] = user;
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Список переполнен, не могу вас внести");
            }
        }
        else if (position.startsWith("H")) {
            user.setPosition(Position.HEAD);
            int flag = 0;
            for (int i=0;i<heads.length;i++) {
                if (heads[i] == null) {
                    heads[i] = user;
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Список переполнен, не могу вас внести");
            }
        }
        else if (user.getPosition() == null) {
            System.out.println("Вы не ввели корректную букву");
            this.input(user);
        }
    }

    @Override
    public String toString() {
        return "List{" +
                "assistants=" + Arrays.toString(assistants) +
                ", employees=" + Arrays.toString(employees) +
                ", seniorAccountants=" + Arrays.toString(seniorAccountants) +
                ", heads=" + Arrays.toString(heads) +
                '}';
    }
}

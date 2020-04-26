package hw250420.hw;

// Создать список объетов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(names[(int) (Math.random() * names.length)], companies[(int) (Math.random()*companies.length)],
                    (int)(Math.random() * 20001 + 40000), (int)(Math.random() * 40 + 21)));}
        System.out.println(Arrays.toString(employees.toArray()));
        return employees;
                    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

        @Override
    public int compareTo (Employee e) {
        return Integer.compare(getSalary(),e.getSalary());
    }
}
class EmployeeNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o, Employee e) {
        return o.getName().compareTo(e.getName());
    }
}
class EmployeeSalaryComparator implements Comparator<Employee>{

    @Override
    public int compare (Employee o,Employee e ) {
        return Integer.compare(o.getSalary(),e.getSalary());
    }
}
class EmployeeAgeComparator implements Comparator<Employee>{

    @Override
    public int compare (Employee o,Employee e) {
        return Integer.compare(o.getAge(),e.getAge());
    }
}
class EmployeeCompanyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o, Employee e) {
        return o.getCompany().compareTo(e.getCompany());
    }
}



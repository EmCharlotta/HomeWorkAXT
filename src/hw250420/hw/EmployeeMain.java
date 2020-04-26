package hw250420.hw;

import java.util.*;

import static hw250420.hw.Employee.employeeGenerator;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = employeeGenerator(13);
        EmployeeNameComparator employeeNameComparator = new EmployeeNameComparator();
        employees.sort(employeeNameComparator);
        System.out.println(employees);
        EmployeeAgeComparator employeeAgeComparator = new EmployeeAgeComparator();
        employees.sort(employeeAgeComparator);
        System.out.println(employees);
        Comparator<Employee> nameAgeCompator = new EmployeeNameComparator().thenComparing(new EmployeeSalaryComparator());
        employees.sort(nameAgeCompator);
        System.out.println(employees);
        Comparator<Employee> allComparator = new EmployeeNameComparator().thenComparing(new EmployeeAgeComparator())
        .thenComparing(new EmployeeSalaryComparator()).thenComparing(new EmployeeCompanyComparator());
        employees.sort(allComparator);
        System.out.println(employees);
    }
}

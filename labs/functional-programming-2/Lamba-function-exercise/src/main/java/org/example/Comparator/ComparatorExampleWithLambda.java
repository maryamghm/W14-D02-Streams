package org.example.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleWithLambda {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John", "Smith", 28);
        Employee employee2 = new Employee(2, "Rayan", "Black", 22);
        Employee employee3 = new Employee(3, "Maya", "Johnson", 35);
        Employee employee4 = new Employee(4, "Emily", "Davis", 27);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);


        System.out.println("\nSorting Employees based on their ages:");
        employees.stream()
                .sorted(Comparator.comparingInt(employee -> employee.getAge()))
                .forEach(System.out::println);

        System.out.println("\nSorting Employees based on their names:");
        employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getFirstName()))
                .forEach(System.out::println);
    }
}

package org.example.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ComparatorExampleWithoutLambda {
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


        Comparator<Employee> compareEmployeesByName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        Comparator<Employee> compareEmployeesByAge = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        };

        System.out.println("\nSorting Employees based on their ages:");
        employees.sort(compareEmployeesByAge);
        for(Employee e: employees) {
            System.out.println(e);
        }

        System.out.println("\nSorting Employees based on their names:");
        employees.sort(compareEmployeesByName);
        for(Employee e: employees) {
            System.out.println(e);
        }
    }
}






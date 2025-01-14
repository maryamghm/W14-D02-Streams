package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static List<Student> students = Arrays.asList(
            new Student("Alice", 20, 88.5),
            new Student("Bob", 22, 75.0),
            new Student("Charlie", 23, 92.0),
            new Student("David", 21, 84.0),
            new Student("Eve", 22, 90.5)
    );;

    public static void main(String[] args) {

        task3();

        task4();

        task5();

        task6();
    }

    private static void task3() {
        System.out.println("\nTask3-1:");
        students.forEach(System.out::println);

        System.out.println("\nTask3-2:");
        students.stream().map(student ->
            new Student(student.getName().toUpperCase(), student.getAge(), student.getGrade())
        ).forEach(System.out::println);


        System.out.println("\nTask3-3:");
        students.stream()
                .filter(student -> student.getAge() >= 22)
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("\nTask3-4:");
        students.stream()
                .sorted(Comparator.comparingDouble(student -> student.getGrade()))
                .forEach(System.out::println);

        System.out.println("\nTask3-5:");
        students.stream()
                .distinct()
                .forEach(student -> System.out.println(student.getName()));

        System.out.println("\nTask3-6:");
        System.out.println(students.stream()
                .filter(student -> student.getAge() > 21)
                .count());

    }


    private static void task4() {
        System.out.println("\nTask4:");
        List<String> studentNames = students.stream()
                .filter(student -> student.getGrade() > 80)
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(studentNames);

    }

    private static void task5() {
        System.out.println("\nTask5-1:");
        System.out.println("Average age: " + students.stream()
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble());

        System.out.println("\nTask5-2:");
        System.out.println("Sum of grades: " + students.stream()
                .mapToDouble(Student::getGrade)
                .sum());
    }

    private static void task6() {
        System.out.println("\nTask6-1:");
        System.out.println("Parallel stream sum of grades: " + students.parallelStream()
                .mapToDouble(Student::getGrade)
                .sum());


        part6_2();
    }

    private static void part6_2() {
        System.out.println("\nTask6-2:");

        List<Student> largeList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            largeList.add(new Student("Student" + i, 20 + (i % 5), 70 + (i % 30)));
        }

        Instant startSequential = Instant.now();
        double sequentialSum = largeList.stream()
                .mapToDouble(Student::getGrade)
                .sum();
        Instant endSequential = Instant.now();

        System.out.println("Sequential sum: " + sequentialSum);
        System.out.println("Time taken (sequential): "
                + Duration.between(startSequential, endSequential).toMillis() + " ms");


        Instant startParallel = Instant.now();
        double parallelSum = largeList.parallelStream()
                .mapToDouble(Student::getGrade)
                .sum();

        Instant endParallel = Instant.now();
        System.out.println("Parallel sum: " + parallelSum);
        System.out.println("Time taken (parallel): "
                + Duration.between(startParallel, endParallel).toMillis() + " ms");
    }


}
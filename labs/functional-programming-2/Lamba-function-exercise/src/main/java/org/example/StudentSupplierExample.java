package org.example;

import java.util.function.Supplier;

public class StudentSupplierExample {
    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> new Student(1, "John", "Male", 20);

        Student student = studentSupplier.get();
        System.out.println(student);

    }
}

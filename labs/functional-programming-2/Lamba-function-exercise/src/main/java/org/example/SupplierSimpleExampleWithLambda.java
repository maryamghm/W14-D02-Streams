package org.example;

import java.util.function.Supplier;

public class SupplierSimpleExampleWithLambda {
    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> "Hello, Supplier Interface with Lambda!";
        System.out.println(stringSupplier.get());
    }
}

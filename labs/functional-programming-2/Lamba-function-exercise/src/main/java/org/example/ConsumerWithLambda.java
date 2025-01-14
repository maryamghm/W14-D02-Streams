package org.example;

import java.util.function.Consumer;

public class ConsumerWithLambda {
    public static void main(String[] args) {

        Consumer<Integer> print3Times = number -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(number);
            }
        };

        print3Times.accept(1000);
    }
}

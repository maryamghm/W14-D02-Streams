package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class PredicateWithLamda {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(10) + 1);
        }

        System.out.println("Generated Numbers: " + numbers);

        System.out.println("Numbers greater than 5:");
        numbers.stream()
                .filter(number -> number > 5)
                .forEach(System.out::println);
    }
}

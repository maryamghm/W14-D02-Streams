package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

class BiggerThanFive<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer v) {
        return v > 5;
    }
}

public class PredicateWithoutLambdaExample {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(10) + 1);
        }

        System.out.println("Generated Numbers: " + numbers);

        BiggerThanFive biggerThanFive = new BiggerThanFive();

        System.out.println("Numbers greater than 5:");
        for (int num : numbers) {
            if (biggerThanFive.test(num)) {
                System.out.println(num);
            }
        }

    }
}
package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIfExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30));
        System.out.println("Original List: " + numbers);

        numbers.removeIf(number -> number % 2 == 0);

        System.out.println("List after removing even numbers: " + numbers);


    }

}

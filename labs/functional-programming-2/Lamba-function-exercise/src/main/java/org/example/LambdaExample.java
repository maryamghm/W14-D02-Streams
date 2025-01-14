package org.example;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // create the list
        //add elements
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Kiwi");
        items.add("Watermelon");

        // use lambda function to display the list
        items.forEach(System.out::println);
    }
}
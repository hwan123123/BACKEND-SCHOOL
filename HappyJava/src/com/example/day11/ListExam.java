package com.example.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);

        fruits.set(1, "blueberry");
        System.out.println(fruits.get(1));

        fruits.remove("cherry");
        System.out.println(fruits);

        fruits.removeFirst();
        System.out.println(fruits);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println(integerList);
        Collections.shuffle(integerList);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
    }
}

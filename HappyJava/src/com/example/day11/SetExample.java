package com.example.day11;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();

        fruitSet.add("사과");
        fruitSet.add("바나나");
        fruitSet.add("키위");
        fruitSet.add("바나나");

        System.out.println(fruitSet);

        if (fruitSet.contains("키위")) {
            System.out.println("true");
        }

        fruitSet.remove("바나나");
        System.out.println(fruitSet);
        System.out.println(fruitSet.size());
    }
}

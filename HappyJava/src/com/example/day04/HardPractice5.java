package com.example.day04;

import java.util.HashSet;

public class HardPractice5 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};

        HashSet<Integer> result = new HashSet<>();

        for (int num : array1) {
            result.add(num);
        }

        for (int num : array2) {
            result.add(num);
        }

        System.out.println(result);
    }
}

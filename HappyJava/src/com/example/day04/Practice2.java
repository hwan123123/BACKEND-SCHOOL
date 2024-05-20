package com.example.day04;

public class Practice2 {
    public static void main(String[] args) {
        double[] doubles = {1.0, 2.5, 3.7, 4.4};

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = i;
            System.out.println(i);
        }
    }
}

package com.example.day04;

public class HardPractic2 {
    public static void main(String[] args) {
        double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};

        double min_num = Double.MAX_VALUE;
        double max_num = Double.MIN_VALUE;

        for (double number : doubles) {
            if (min_num > number)
                min_num = number;
            if (max_num < number)
                max_num = number;
            }
        System.out.println("최대값은 : " + max_num);
        System.out.println("최소값은 : " + min_num);
    }
}

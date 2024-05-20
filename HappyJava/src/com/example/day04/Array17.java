package com.example.day04;

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,6};

        Arrays.sort(array);

        for(int i : array){
            System.out.println(i);
        }
    }
}

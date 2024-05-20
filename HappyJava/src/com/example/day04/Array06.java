package com.example.day04;

public class Array06 {
    public static void main(String[] args) {
        int[] iarr = new int[5];

        System.out.println(iarr.length);

        for(int i = 0; i < iarr.length; i++) {
            iarr[i] = i + 1;
        }

        for(int i = 0; i<args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

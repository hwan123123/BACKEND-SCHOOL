package com.example.day03;

public class Practice3 {
    public static void main(String[] args) {
        int a = 1;

        while(a < 10) {
            int b = 2;
            while(b < 10) {
                System.out.println(b + " * " + a + " = " + (b*a));
                b++;
            }
            a++;
        }
    }
}

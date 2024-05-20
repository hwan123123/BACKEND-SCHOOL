package com.example.day16;

public class MyFunctionalInterface3Test {
    public static void main(String[] args) {
        MyFunctionalInterface3 fi3;

        fi3 = (x, y) -> {
            System.out.println(x + y);
            return x + y;
        };

        fi3.method(5,7);
    }
}

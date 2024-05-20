package com.example.day09;

public class OuterClass {
    private int outerField = 10;

    public void outerMethod() {

    }

    class InnerClass {
        public void innerMethod() {
            System.out.println("outerFiled = " + outerField);
        }
    }
}

package com.example.day05;

public class ClassA {
    public static int fieldA;
    public int fieldB;
    int count;
    protected  int number;
    private String address;
    public String name;

    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.address);
        System.out.println(a.count);
        System.out.println(a.number);
        System.out.println(a.name);
    }
}

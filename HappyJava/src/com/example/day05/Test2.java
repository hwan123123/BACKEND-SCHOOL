package com.example.day05;

public class Test2 extends ClassA {

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
//        System.out.println(a.address); // private
//        System.out.println(a.count); // package
//        System.out.println(a.number); // protected
        System.out.println(a.name); //
    }
}

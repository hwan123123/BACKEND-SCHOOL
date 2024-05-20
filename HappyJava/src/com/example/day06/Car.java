package com.example.day06;

public class Car {
    String name;
    int speed;

    public Car() {
        System.out.println("Car() 생성자 호출");
    }

    public Car(String name) {
        this.name = name;
//        this(0, name);
        System.out.println("Car(string name) 생성자 호출");
    }

    public Car(int speed, String name) {
        this.name = name;
        this.speed = speed;
        System.out.println("Car(int speed, String name) 생성자 호출");
    }

    public Car(int speed) {
//        this(speed, "");
        this.speed = speed;
        System.out.println("Car(int speed) 생성자 호출");
    }
}

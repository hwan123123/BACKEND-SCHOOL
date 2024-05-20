package com.example.day06.Exam;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }
}

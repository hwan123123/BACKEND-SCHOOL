package com.example.day06.Exam;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Porsche","911",2024);
        car.displayInfo();

        System.out.println("=========================");

        ElectricCar electricCar = new ElectricCar("Porsche","Taycan",2024,93.4);
        electricCar.displayInfo();
    }
}

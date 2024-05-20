package com.example.day06.Exam;

public class ElectricCar extends Car {
    double batteryCapacity;

    public ElectricCar(String brand, String model, int year, double batteryCapacity) {
        super(brand,model,year);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

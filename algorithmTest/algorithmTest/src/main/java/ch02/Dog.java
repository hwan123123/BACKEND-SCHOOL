package ch02;

public class Dog {
    String breed;
    int age;
    String color;

    void bark() {
        System.out.println("Woof!");
    }
    void displayInfo() {
        System.out.println("Brred: " + breed + " Age: " + age + " Color: " + color);
    }
}

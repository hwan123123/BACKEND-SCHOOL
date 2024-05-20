package ch02;

public class DogTest {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // 인스턴스화
        myDog.breed = "Labrador";
        myDog.age = 5;
        myDog.color = "Brown";
        myDog.bark();
        myDog.displayInfo();
    }
}

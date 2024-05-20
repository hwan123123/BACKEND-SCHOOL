package com.example.day07;

public class Aimpl implements Ainter {
    @Override
    public void aMethod() {
        System.out.println("aMethod 구현");
    }

    @Override
    public void same() {
        System.out.println("same 구현");
    }
    
    public void say() {
        System.out.println("Aimpl이 가진 메소드");
    }
}

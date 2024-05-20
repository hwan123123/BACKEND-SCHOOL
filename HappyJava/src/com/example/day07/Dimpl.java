package com.example.day07;

public class Dimpl implements Dinter {
    @Override
    public void dMethod() {
        System.out.println("dMethod 구현");
    }

    @Override
    public void aMethod() {
        System.out.println("aMethod 구현");
    }

    @Override
    public void cMethod() {
        System.out.println("cMethod 구현");
    }

    @Override
    public void same() {
        System.out.println("same 구현");
    }

    @Override
    public void bMethod() {
        System.out.println("bMethod 구현");
    }
}

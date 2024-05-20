package com.example.day07;

public class InterfaceDemo {
    public static void main(String[] args) {
        //인터페이스도 타입니다.
        Ainter ainter = new Dimpl();
        Cinter cinter = new Dimpl();

        //자기가 정의한 것만 사용 가능.
        ainter.aMethod();
        cinter.cMethod();

        Binter binter = new Dimpl();
        Dinter dinter = new Dimpl();

        binter.bMethod();
        binter.aMethod();
        binter.same();
    }
}

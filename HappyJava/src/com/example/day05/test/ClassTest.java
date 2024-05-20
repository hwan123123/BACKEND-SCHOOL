package com.example.day05.test;

import com.example.day05.ClassB;

public class ClassTest extends ClassB {

    public void print(ClassTest b) {
        System.out.println(b.name);
        System.out.println(b.flag); // 패키지가 달라도 상속 관계에 있으므로 사용 가능
//        System.out.println(b.address);
//        System.out.println(b.age);
    }
    public static void main(String[] args) {
        ClassTest test = new ClassTest();
        test.print(test);
    }
}

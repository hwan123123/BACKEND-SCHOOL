package com.example.day01;

public class OpExam3 {
    public static void main(String[] args) {
        // 조건식 ? 반환값1 : 반환값2
        int a = 10;
        int b = 10;

        int result = a >= b ? a : b;

        System.out.println(result);

        Book book = new Book();
        if(book instanceof Object) {
            System.out.println("Book 은 객체 입니다.");
        }
    }
}

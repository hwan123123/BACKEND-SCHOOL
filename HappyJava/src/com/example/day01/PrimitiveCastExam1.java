package com.example.day01;

public class PrimitiveCastExam1 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;  // 묵시적 형변환

        b = (byte)i;  // 명시적 형변환

        System.out.println(b);
        System.out.println(i);
    }
}

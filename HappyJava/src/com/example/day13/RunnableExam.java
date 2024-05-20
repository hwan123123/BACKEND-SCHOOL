package com.example.day13;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("MyRunnable 출발!!");
        for (int i = 0; i < 100; i++) {
            System.out.println("MyRunnable 안녕!!");
        }
        System.out.println("MyRunnable 종료!!");
    }
}

class HwanRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("HwanRunnable 출발!!");
        for (int i = 0; i < 100; i++) {
            System.out.println("HwanRunnable 안녕!!");
        }
        System.out.println("HwanRunnable 종료!!");
    }
}

public class RunnableExam {
    public static void main(String[] args) {
        System.out.println("main 출발!!");

        //쓰레드 생성.
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();

        Thread hwanThread = new Thread(new HwanRunnable());
        hwanThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main 안녕!!");
        }
        System.out.println("main 종료!!");
    }
}

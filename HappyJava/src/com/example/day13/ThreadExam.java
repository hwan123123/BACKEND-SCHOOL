package com.example.day13;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("myThread 출발!!");
        //쓰레드가 해야하는 일
        for (int i = 0; i < 100; i++) {
            System.out.println("myThread 안녕!!!");
        }
        System.out.println("myThread 종료!!");
    }   //상속.. Thread를 상속받은 MyThread는 Thread이다.
}

class HwanThread extends Thread {
    @Override
    public void run() {
        System.out.println("HwanThread 출발!!");

        for (int i = 0; i < 100; i++) {
            System.out.println("HwanThread 안녕!!");
        }
        System.out.println("HwanThread 종료!!");
    }
}

public class ThreadExam {
    public static void main(String[] args) {
        System.out.println("main 출발!!");

        //쓰레드 생성.
        MyThread myThread = new MyThread();
        myThread.start();   //약속

        HwanThread hwanThread = new HwanThread();
        hwanThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main 안녕!!");
        }
        System.out.println("main 종료!!");
    }
}

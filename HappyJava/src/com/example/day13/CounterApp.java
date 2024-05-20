package com.example.day13;

class IncrementCounter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Increment: " + i);
            try {
                Thread.sleep((long) (Math.random() * 10)); // 0~10 밀리초 사이의 무작위 지연
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DecrementCounter implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println("Decrement: " + i);
            try {
                Thread.sleep((long) (Math.random() * 10)); // 0~10 밀리초 사이의 무작위 지연
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CounterApp {
    public static void main(String[] args) {
        Thread incrementThread = new Thread(new IncrementCounter());
        Thread decrementThread = new Thread(new DecrementCounter());

        incrementThread.start();
        decrementThread.start();
    }
}
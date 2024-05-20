package com.example.day05.main;

import com.example.day05.util.Ball;

public class LottoUser {
    public static void main(String[] args) {
        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.mix();
        for (int i = 0; i < 7; i++) {
            Ball ball = lottoMachine.getBall();
            System.out.println(ball.number);
        }
    }
}

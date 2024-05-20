package com.example.day05.util;

import java.util.Random;

public class Dice {
    public int face = 6;
    public int eye;

    public void rollDice() {
        Random random = new Random();
        eye = random.nextInt(face) + 1;
    }

    public int diceEye() {
        return eye;
    }
}

package com.example.day05.main;

import com.example.day05.util.Dice;

public class DiceTest {
    public static void main(String[] args) {
        Dice dice = new Dice();

        dice.rollDice();
        System.out.println(dice.diceEye());
    }
}

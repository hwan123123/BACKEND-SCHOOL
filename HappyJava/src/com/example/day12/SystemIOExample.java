package com.example.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIOExample {
    public static void main(String[] args) {
        //키보드로부터 한 줄 입력 받기 위한 IO 객체를 생성해주세요.
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("문자열을 입력하세요.");
            String userInput = br.readLine();
            System.out.println(userInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

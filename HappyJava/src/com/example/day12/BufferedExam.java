package com.example.day12;

import java.io.*;

public class BufferedExam {
    public static void main(String[] args) {
        // 키보드 입력을 받기 위한 BufferedReader 객체 생성
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new FileWriter("test.txt"))) {
            for (int i = 0; i < 5; i++) {
                System.out.println("텍스트를 입력하세요 :");
                String input = br.readLine();
                pw.println(input);
            }
            System.out.println("입력이 완료되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

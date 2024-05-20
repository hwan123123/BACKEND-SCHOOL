package com.example.day12;

import java.io.*;

public class IOExam3 {
    public static void main(String[] args) {
        //"test.txt" 파일에서 한 줄씩 입력 받아서 입력 받은 문자 뒤에 hi를 추가해서
        // "testhi.txt" 파일에 출력하는 프로그램을 작성해보세요.
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("testHi.txt"))) {
            String text;
            while ((text = br.readLine()) != null) {
                pw.println(text + "Hi");
            }
            System.out.println("출력을 완료하였습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

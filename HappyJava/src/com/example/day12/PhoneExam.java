package com.example.day12;

import java.io.*;

public class PhoneExam {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter pw = new PrintWriter(new FileWriter("phone.txt"));
        ) {
            for (int i = 0; i < 3; i++) {
                System.out.print("이름 : ");
                String name = br.readLine();
                System.out.print("전화번호 : ");
                String number = br.readLine();
                pw.println(name + " " + number);
            }
            System.out.println("... 전화번호가 phone.txt에 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                BufferedReader br = new BufferedReader(new FileReader("phone.txt"))
        ) {
            String str;
            System.out.println("phone.txt의 내용은 다음과 같습니다...");
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
//            for (int i = 0; i < 3; i++) {
//                str = br.readLine();
//                System.out.println(str);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

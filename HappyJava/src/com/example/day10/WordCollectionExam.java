package com.example.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCollectionExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> wordList = new ArrayList<>();

        inputWords(wordList, sc);
        printWordList(wordList);
    }

    private static void inputWords(List<String> wordList, Scanner sc) {
        while (true) {
            System.out.println("단어를 입력해주세요. quit을 입력하면 종료됩니다.");
            String word = sc.nextLine();
            if (word.equals("quit")) {
                wordList.remove("quit");
                break;
            } else {
                wordList.add(word);
            }
        }
    }

    private static void printWordList(List<String> wordList) {
        System.out.println("입력된 단어 : " + wordList);

        int wordCount = wordList.size();
        int totalLength = 0;
        String longestWord = "";

        for (String word : wordList) {
            totalLength += word.length();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("단어 수 : " + wordCount);
        System.out.println("글자 수의 합 : " + totalLength);
        System.out.println("가장 긴 단어 : " + longestWord);
        System.out.println("가장 긴 단어의 길이 : " + longestWord.length());
    }
}

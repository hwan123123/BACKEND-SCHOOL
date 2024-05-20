package com.example.day12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static class TextFileManager {
        private String filepath;

        public TextFileManager(String filepath) {
            this.filepath = filepath;
        }

        public void writeToFile(List<String> lists) {
            try (PrintWriter pw = new PrintWriter(new FileWriter(filepath))) {
                for (String list : lists) {
                    pw.println(list);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public List<String> readFromFile() {
            List<String> lists = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
                String list;
                while ((list = br.readLine()) != null) {
                    lists.add(list);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return lists;
        }
    }

    public static class UserInputHandler {
        public List<String> getUserInput() {
            List<String> userInput = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Enter text (Press Enter twice to finish) : ");
                String line;
                while (!(line = br.readLine()).isEmpty()) {
                    userInput.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return userInput;
        }
    }

    public static void main(String[] args) {
        String filePath = "texts.txt";
        TextFileManager fileManager = new TextFileManager(filePath);
        UserInputHandler inputHandler = new UserInputHandler();

        List<String> userInput = inputHandler.getUserInput();
        fileManager.writeToFile(userInput);

        List<String> fileContent = fileManager.readFromFile();
        System.out.println("Content of the file : ");
        fileContent.forEach(System.out::println);
    }
}

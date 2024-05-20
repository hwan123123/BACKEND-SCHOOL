package ch05;

import java.util.Scanner;
import java.util.Stack;

public class IterativeExploration {
    static void displayPatternIteratively(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (current > 0) {
                stack.push(current - 1);
                System.out.println("Number: " + current);

                if (current - 2 > 0) {
                    stack.push(current -2 );
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("출력할 숫자를 입력하세요 : ");
        int x = stdIn.nextInt();

        displayPatternIteratively(x);
    }
}

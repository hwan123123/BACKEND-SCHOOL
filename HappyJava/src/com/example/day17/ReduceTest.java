package com.example.day17;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum);

        List<Member> memberList = Arrays.asList(
                new Member("hwan", 100),
                new Member("seo", 90),
                new Member("ryu", 90),
                new Member("kim", 80)
        );

        //Member 들의 score 의 총합을 구해봅시다.
        int memberScoreSum = memberList.stream().mapToInt(Member::getScore).sum();
        System.out.println(memberScoreSum);

        int memberScoreSum2 = memberList.stream().mapToInt(Member::getScore)
                .reduce(0, (a,b) -> a+b);
        System.out.println(memberScoreSum2);

        int memberScoreSum3 = memberList.stream().mapToInt(Member::getScore)
                .reduce((a,b) -> a+b).getAsInt();
        System.out.println(memberScoreSum3);
    }
}

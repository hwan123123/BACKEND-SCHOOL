package com.example.day17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingTest {
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(
                new Member("hwan", 29, Member.MALE),
                new Member("seo", 30, Member.FEMALE),
                new Member("ryu", 32, Member.MALE),
                new Member("lee", 26, Member.FEMALE)
        );

        Map<Integer, List<Member>> mapBySex = memberList.stream()
                .collect(Collectors.groupingBy(Member::getSex));
        System.out.println("남자 ");
        mapBySex.get(Member.MALE).stream().forEach(member -> System.out.println(member.getName()));

        System.out.println("여자 ");
        mapBySex.get(Member.FEMALE).stream().forEach(member -> System.out.println(member.getName()));
    }
}

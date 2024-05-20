package com.example.day16;

import java.util.function.*;

public class LambdaExam3 {
    public static void main(String[] args) {
        //Predicate
        //조건을 테스트하는데 사용. booelan값 변환
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-0));

        //Consumer
        //입력을 받고 반환값이 없는 연산을 수행
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("hello hwan!!");

        //Function
        //입력을 받아서 출력을 반환하는..
        Function<String, Integer> lengthFunc = s -> s.length();
        System.out.println(lengthFunc.apply("hello hwan!!"));

        //Supplier
        //입력 없이 값을 반환
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(intSupplier.getAsInt());

        //UnaryOperator
        //입력과 출력이 같은 타입의 값일 때 사용
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        //BiFunction
        //두 개의 입력을 받고 하나의 결과를 반환
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(1, 2));

        //Consumer 의 andThen 메소드 활용
        Consumer<String> conA = s -> System.out.println(s + "aaaa");
        Consumer<String> conB = s -> System.out.println(s + "bbbb");
        conA.accept("hwan");
        conB.accept("hwan");

        Consumer<String> conAB = conA.andThen(conB);
        conAB.accept("hwan");
    }
}

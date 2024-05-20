package com.example.day07;

abstract public class 새 {
    //기능의 표준화.
    //강제성 (반두시 구현해야함.)

    abstract public void 노래하다();
}
    class 비둘기 extends 새 {
        @Override
        public void 노래하다() {
            System.out.println("구구");
        }
    }
    class 참새 extends 새 {
        @Override
        public void 노래하다() {
            System.out.println("짹짹");
        }
    }
    class 까마귀 extends 새 {
        @Override
        public void 노래하다() {
            System.out.println("깍깍");
        }
    }

package com.programmers.java.lambda.메소드레퍼런스;
/*
- 람다표현식에서 입력되는 값을 변경없이 바로 사용하는 경우
- 최종으로 적용될 메소드의 레퍼런스를 지정해 주는 표현 방식
- 입력되는 값을 변경하지 말라는 표현방식(의지의 표현)
*/
public class Main {
    public static void main(String[] args) {
        MySupplier s1 = new MySupplier() {
            @Override
            public String supply() {
                return "무언가를 돌려줘야하는 친구";
            }
        };

        MySupplier<String> s2 = () -> "람다식으로 돌려주는 친구";

        MyMapper<String, Integer> m1 = String::length;

        MyConsumer c = System.out::println;

        MyRunnable r = () -> c.consume(m1.map(s2.supply()));

        r.run();
    }
}

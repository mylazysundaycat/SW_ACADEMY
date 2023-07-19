package com.programmers.java.lambda.익명메소드2;

public class Main {
    public static void main(String[] args) {
        MySupplier s1 = new MySupplier() {
            @Override
            public String supply() {
                return "무언가를 돌려줘야하는 친구";
            }
        };

        MySupplier s2 = () -> "람다식으로 돌려주는 친구";

        MyMapper m1 = (str) -> str.length();

        MyConsumer c = i -> System.out.println(i);

        MyRunnable r = () -> {
            c.consume(m1.map(s2.supply()));
        };

        r.run();
    }
}

package com.programmers.java.lambda.익명메소드;

/*
Lambda 익명메소드
-

 */
public class Main {
    public static void main(String[] args) {
        MyRunnable r1 = () -> System.out.println("Hello");
        

        MyRunnable r2 = () -> System.out.println("MyRunnable 람다 표현식");
        MySupply s1 = () -> "MySupply 람다 표현식";
        MyRunnable r3 = () -> {
            MySupply s2 = () -> "Hello Hello Hello";
            System.out.println(s2.supply());
        };
        r3.run();

    }
}

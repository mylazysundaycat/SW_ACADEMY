package com.programmers.java.lambda.익명메소드;

@FunctionalInterface
public interface MyRunnable {
    void run(); //추상 메소드가 하나밖에 없는 메소드 == 함수형 인터페이스
}

interface MyRunnable2 {
    void run1();
    void run2();
}

@FunctionalInterface
interface MyMap {
    void map(); //추상 메소드가 하나밖에 없는 메소드 == 함수형 인터페이스
    default void sayHello(){
        System.out.println("Hello World");
    }
    static void sayBye(){
        System.out.println("Bye World");
    }
}
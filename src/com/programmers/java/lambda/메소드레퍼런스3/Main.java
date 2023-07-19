package com.programmers.java.lambda.메소드레퍼런스3;

/*
- 람다표현식에서 입력되는 값을 변경없이 바로 사용하는 경우
- 최종으로 적용될 메소드의 레퍼런스를 지정해 주는 표현 방식
- 입력되는 값을 변경하지 말라는 표현방식(의지의 표현)
*/

public class Main {
    public static void main(String[] args) {
        new Main().loop(10, System.out::println);
    }

    void loop(int n, MyConsumer<Integer> consumer){
        for (int i =0; i<n; i++){
                consumer.consume(i);
        }
    }
}

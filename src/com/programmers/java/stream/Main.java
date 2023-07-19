package com.programmers.java.stream;

import java.util.Arrays;

/*
Stream
- Java 8 부터 가능
- Collections.stream() (Java 8 이상)
- filter, map, forEach 같은 고차함수(함수형 인터페이스를 사용해서 함수가 인자로 제공되는 함수)가 제공이 됩니다

- 데이터의 연속이다
- System.in/System.out

- Stream을 만들 때 Stream.generate/Stream.iterate로 만들 수 있다


 */
public class Main {
    public static void main(String[] args) {
        Arrays.asList("A", "AB", "ABC", "ABCD", "ABCDE")
                .stream()
                .map(s -> s.length())
                .filter(i->i%2==1)
                .forEach(i-> System.out.println(i));
    }
}

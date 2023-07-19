package com.programmers.java.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        /*
        Arrays.asList(1,2,3)
                .stream();
        IntStream s2 = Arrays.stream(new int[]{1,2,3}); //primitive 타입을 위한 스트림
        Arrays.stream(new int[]{1,2,3}).boxed().collect(Collectors.toList());
         */
        /*
        Boxed가 뭘까요..?
         */

        /*
        Random r = new Random();
        Stream.generate(()->1)
                .forEach(System.out::println);
        // stream은 데이터의 연속이기 때문에 1이 계속 생성된다.
        */

        Stream.iterate(0, (i)->i+10)
                .limit(20)
                .forEach(System.out::println);

    }
}

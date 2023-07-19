package com.programmers.java.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        /*
        // 주사위를 100번 던져서 6이 나올 확률을 구하시오.
        Random r = new Random();
        Stream.generate(()->r.nextInt())
                .limit(10)
                .forEach(System.out::println);

        */
        
        //1~9사이 중에서 겹치지 안헥 3개를 출력하라
        Random r = new Random();
        int[] count = Stream.generate(()->r.nextInt(10)+1)
                .distinct() //중복제거
                .limit(6)
                .mapToInt(i ->i)
                .toArray();

        System.out.println(Arrays.toString(count));
    }
}

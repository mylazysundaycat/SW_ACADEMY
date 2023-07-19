package com.programmers.java.collection;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        /*
        MyCollection<String> c1= new MyCollection<>(Arrays.asList("A","DB","CFD","EHDJ","CWVAS"));
        MyCollection<Integer> c2 = c1.map(s -> s.length());
        c2.foreach(System.out::println);
        */
        //method Chaining
        int s = new MyCollection<>(Arrays.asList("A","DB","CFD","EHDJ","CWVAS"))
                .map(String::length)
                .filter(i -> i%2 == 1)
                .size();

        System.out.println(s);

    }
}

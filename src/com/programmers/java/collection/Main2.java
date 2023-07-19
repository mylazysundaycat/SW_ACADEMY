package com.programmers.java.collection;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        new MyCollection<User>(
                Arrays.asList(
                      new User(15, "AAA"),
                      new User(16, "BBB"),
                      new User(17, "CCC"),
                      new User(18, "DDD"),
                      new User(19, "FFF"),
                      new User(20, "GGG"),
                      new User(21, "HHH")
                )
        )
                .filter(u -> u.isOver19())
                .foreach(System.out::println);
    }
}

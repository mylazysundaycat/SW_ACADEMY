package com.programmers.java.lambda.익명클래스;
/*
인터페이스 임시 생성하기
익명 클래스를 사용해서 인터페이스의 인스턴스를 생성하고 구현을 바로 정의한다
 */
public class Main {
    public static void main(String[] args) {
        new SayHello().run(); // interface를 사용하기 위해선 클래스를 빌려야함

        new MySupply(){
            @Override
            public String supply(){
                return "HI";
            }
        }.supply(); // interface를 직접 가져옴

        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                MySupply s = new MySupply() {
                    @Override
                    public String supply() {
                        return "인터페이스를 직접 사용하기 위한 익명 메소드";
                    }
                };
                System.out.println(s.supply());
            }
        };
        r.run();
    }
}

class SayHello implements  MyRunnable{
    @Override
    public void run(){
        System.out.println(new Greeting().supply());
    }
}

class Greeting implements MySupply{
    @Override
    public String supply(){
        return  "Hello World";
    }
}

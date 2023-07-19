package com.programmers.java.iter;
import com.programmers.java.collection.MyCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
Iterator

- 여러 데이터의 묶음을 풀어서 <하나씩> 처리하는 방식
- next()를 통해서 다음 데이터를 조회할 수 있다
- 역으로 움직일 순 없음 (이전데이터 조회할 수 없다)

 */

public class Main {
    public static void main(String[] args) {
        MyIterator<String> iter =
        new MyCollection<String>(Arrays.asList("A","CA","DSB","ASDF","DKFHJ"))
                .iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        /*
        List<String> list = Arrays.asList("A","B","C","D","E");
        Iterator<String> iter = list.iterator();
        System.out.println(iter.next()); //next()를 출력할때마다 하나씩 데이터를 출력함
        System.out.println(iter.next());
        iter.next();
        System.out.println(iter.next());
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        */

    }
}

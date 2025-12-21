package com.crud1.Sample1;

import java.util.LinkedList;
import java.util.Queue;

public class Quueee {
    public static void main(String[] args) {

        Queue q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);

        q.add("new");
        System.out.println(q);

        System.out.println(q.size());




    }
}

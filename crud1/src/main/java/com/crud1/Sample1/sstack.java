package com.crud1.Sample1;

import java.util.Stack;

public class sstack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.remove(Integer.valueOf(10)));
        System.out.println(stack);

        System.out.println(stack.size());
    }
}

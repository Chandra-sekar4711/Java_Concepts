package com.crud1.Sample;


import java.util.Iterator;
import java.util.Stack;

public class stackk {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);

        s.pop();
        System.out.println(s);
        System.out.println(s.peek());

       Iterator i = s.iterator();
       while (i.hasNext())
       {
           if (i.next().equals(10))
           {
               i.remove();
           }
       }
        System.out.println(s);

    }
}

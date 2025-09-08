package com.crud1.Sample;

import java.util.*;

public class ArrayListt {
    public static void main(String[] args) {

        List<Object> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(40);
        System.out.println(l1);

        for(Object i:l1)
        {
            System.out.println(i);
        }

        l1.add(2,30);
        System.out.println(l1);

        l1.set(2,25);
        System.out.println(l1);

        l1.remove(3);
        System.out.println(l1);

        System.out.println( l1.indexOf(25));

        List<Object> al1 = new ArrayList<>();
        al1.add("chandra");
        al1.add("sekar");
        al1.add("arun");
        System.out.println(al1);

        l1.addAll(al1);
        System.out.println(l1);

        l1.add(3,30);
        System.out.println(l1);

        l1.remove(5);
        System.out.println(l1);

        l1.remove(Integer.valueOf(30));
        System.out.println(l1);

        l1.removeAll(al1);
        System.out.println(l1);

        System.out.println(l1.isEmpty());

        System.out.println(l1.contains(20));

        System.out.println(l1.size());

        Iterator i = l1.iterator();
        while(i.hasNext())
        {
            if(i.next().equals(25)) {
                i.remove();
            }
        }
        System.out.println(l1);
        System.out.println("*****************************************************");

        List<Object> ll = new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add("sekar");
        System.out.println(ll);
        System.out.println("*****");
        ListIterator il = ll.listIterator(ll.size());
        while( il.hasPrevious()){
           if(il.previous().equals(200))
           {
               il.set(2000);
               il.add(250);

           }
       }
        System.out.println(ll);

    }
}

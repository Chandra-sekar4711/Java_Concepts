package com.crud1.Sample;

import java.util.*;

public class Mapp {
    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"chandrasekar");
        hm.put(2,"balaji");
        hm.put(3,"Rajasekar");
        hm.put(null,null);
        hm.put(5,null);
        System.out.println(hm);

        Set<Map.Entry<Integer,String>> entryset = hm.entrySet();
        System.out.println(entryset);


        Set keyset = hm.keySet();
        System.out.println(keyset);

        Collection c = hm.values();
        System.out.println(c);

        Iterator<Map.Entry<Integer,String>> i = entryset.iterator();
        while(i.hasNext())
        {
            Map.Entry<Integer,String> val = i.next();
            System.out.println("Keys***********"+ val.getKey());
            System.out.println("Values*********"+val.getValue());
            if(val.getValue()==(null))
            {
                i.remove();
            }


        }

        System.out.println(entryset);


        System.out.println("*******************Hash Table");
        Map<Integer,String> ht = new Hashtable<>();
        ht.put(1,"chandrasekar");
        ht.put(2,"balaji");
        ht.put(3,"Rajasekar");
        System.out.println(ht);

        System.out.println("*******************Tree Map");
        Map<Integer,String>  tm = new TreeMap<>();
        tm.put(1,"chandrasekar");
        tm.put(2,"balaji");
        tm.put(3,"Rajasekar");
        tm.put(4,null);
        System.out.println(tm);


    }
}

package com.crud1.Sample1;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Hashmapp {
    static Map chm = new ConcurrentHashMap();
    public static void main(String[] args) throws InterruptedException {
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"Chandrasekar");
        hm.put(2,"Balaji");
        hm.put(3,"RajaSekar");
        hm.put(null,null);
        hm.put(null,null);
        System.out.println(hm);

        System.out.println(hm.get(2));

        hm.remove(1);
        System.out.println(hm);

        //Convert into set
        Set<Map.Entry<Integer,String>> setmap = hm.entrySet();
        for (Map.Entry<Integer,String> ff : setmap)
        {
            System.out.println("id is -->"+ff.getKey() +" and name is --> " +ff.getValue() );
        }

        //convert into value
        Collection value = hm.values();
        System.out.println(value);

        //Key
        Set key = hm.keySet();
        System.out.println(key);

        Map<Integer,String> hasttable = new Hashtable();
        hasttable.put(1,"sk");
        hasttable.put(2,"RK");
        hasttable.put(3,"BK");
       // hasttable.put(4,null);
        System.out.println(hasttable);


        Map<Integer,String> Treemap =  new TreeMap<>();
        Treemap.put(11,"tm11");
        Treemap.put(12,"tm12");
        Treemap.put(13,"tm13");
        Treemap.put(14,null);
        System.out.println(Treemap);


        Thread t1 = new Thread(Hashmapp::cal1);
        Thread t2 = new Thread(Hashmapp::cal2);
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(chm);

    }

    public static void cal1() {
        for (int i = 1; i <= 5; i++) {
            chm.put("key"+i, i);
        }
    }

    public static void cal2() {
        for (int i = 1; i <= 5; i++) {
            chm.put("key"+i, i);
        }
    }
}

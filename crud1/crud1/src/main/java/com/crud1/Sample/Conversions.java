package com.crud1.Sample;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class Conversions {
    public static void main(String[] args) {
        System.out.println("*******************Array to ArrayList nad Viceversa***********************");
        /*  Array to arrayList*/
        Integer a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> l = Arrays.asList(a);
        System.out.println(l);
        //cant add
        /*l.add(10);
        System.out.println(l);*/
        //str[] to arraylist

        String s[] = {"abc", "def"};
        List<String> sl = Arrays.asList(s);
        System.out.println(sl);

        /* Arraylist to array*/
        List<Integer> li = new ArrayList<>();
        li.add(100);
        li.add(200);
        li.add(300);
        Object[] oa = li.toArray();
        System.out.println(Arrays.toString(oa));

        List ol = new ArrayList();
        ol.add("chandra");
        ol.add("Sekar");
        ol.add(10);
        Object[] ooj = ol.toArray();
        System.out.println(Arrays.toString(ooj));

        System.out.println("*****************Array to string and vice cersa***********************");
        //Array to string
        int a1[] = {1, 2, 3, 4, 5};
        String s1 = "";
        for (int i = 0; i < a1.length; i++) {
            s1 = s1 + a1[i];
        }
        System.out.println(s1);

        String[] sa = {"arun", "Ramesh"};
        String se = String.join(",", sa);
        System.out.println(se);

        //Integer String to array
        String sii = "123456";
        int ao[] = new int[sii.length()];
        for (int i = 0; i < sii.length(); i++) {
            ao[i] = sii.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(ao));

        Integer op = Integer.parseInt(sii);
        System.out.println(op + 1);
        //char string to array
        String sd = new String("vinothkumar");
        char[] chh = new char[sd.length()];
        for (int i = 0; i < sd.length(); i++) {
            chh[i] = sd.charAt(i);
        }
        System.out.println(Arrays.toString(chh));

        char[] ch = sd.toCharArray();
        System.out.println(Arrays.toString(ch));

        //String to string array
        String ssa = "Hi Hello World";
        String ab[] = ssa.split(" ");
        System.out.println(Arrays.toString(ab));

        System.out.println("*****************Wrapper class conversion***********************");
        //primitive to non primitive
        int a2 = 101;
        Integer res = Integer.valueOf(a2);
        System.out.println(res);

        int a3 = 102;
        Integer res1 = a3;
        System.out.println(res1);

        //non primitive to  primitive

        Integer a4 = 151;
        int we = a4.intValue();
        System.out.println(we);

        int wee = a4;
        System.out.println(wee);

        //String to int and int to String
        int ds = 123456;
        String result = String.valueOf(ds);
        System.out.println(result + 11);

        String oop = "123";
        int sg = Integer.parseInt(oop);
        System.out.println(sg + 2);

        System.out.println("*****************************ArrayList to set ******************************************");

        List<Integer> kk = new ArrayList<>();
        kk.add(200);
        kk.add(200);
        kk.add(100);
        kk.add(50);
        System.out.println("Lsit****"+kk);

        Set<Integer> ss = new HashSet<>(kk);
        System.out.println("Set****"+ss);

        List<Integer> et = new ArrayList<>(ss);
        System.out.println(et);

        System.out.println("*****************************ArrayList to Map****************");
        List<String> lss = new ArrayList<>();
        lss.add("rajini");
        lss.add("Kamal");

        Map<Integer,String> hm = new HashMap<>();
        int i=0;
        for (String resd : lss)
        {
            hm.put(i,resd);
            i++;
        }
        System.out.println(hm);

        Collection cc = hm.values();
        System.out.println(cc);
        System.out.println("**************************Map to Entity*********************");

        Map<String,Object> hm1 = new HashMap();
        hm1.put("name","chandrasekar");
        hm1.put("age",26);
        hm1.put("address","Pochampalli");
        System.out.println(hm1);

      ObjectMapper obk = new ObjectMapper();
      Student stud = obk.convertValue(hm1,Student.class);
      System.out.println(stud);
      System.out.println(stud.getAddress());


    }
}

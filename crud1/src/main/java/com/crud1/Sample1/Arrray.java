package com.crud1.Sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrray {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        int b[] = new int[3];
        b[0]=100;
        b[1]=200;
        System.out.println(Arrays.toString(b));

        int[] c = new int[]{1000,2500,200};
        System.out.println(Arrays.toString(c));

        System.out.println("//length");
        System.out.println(c.length);
        System.out.println("//sorting");
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        System.out.println("//binarySearch");
        int res = Arrays.binarySearch(c,200);
        System.out.println(res);

        char[] ch = new char[]{'s','e','k','a','r'};
        System.out.println(Arrays.toString(ch));

        System.out.println(ch[0]);

        for (int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);
        }

        for (char i : ch)
        {
            System.out.println((char)(i-32));
        }
       int d= 65;
        System.out.println(d);
        char tt = (char)d ;
        System.out.println(tt);

        Integer[] g = {1,2,3,4,5,6};
        List<Integer> jj = Arrays.asList(g);
        System.out.println(jj);

        int[] s = new int[5];
        s[0] = 11;
        s[1] =22;
        s[2] = 33;
        s[3] =44;
        s[4] = 55;

        System.out.println(Arrays.toString(s));

        System.out.println(s[1]);

        s[4]=555;
        System.out.println(Arrays.toString(s));

        System.out.println("//=========================================================================");
        //Comparable Interface

        int com[] = new int[] {100,22,17,1,74,3,0};
        System.out.println(Arrays.toString(com));
        Arrays.sort(com);
        System.out.println(Arrays.toString(com));







    }
}

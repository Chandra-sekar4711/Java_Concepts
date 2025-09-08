package com.crud1.Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayss {

    public static void main(String[] args) {
        int a1[] = new int[2];
        a1[0] =11;
        a1[1]=22;

        System.out.println(Arrays.toString(a1));

        int a[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        int b[] = new int[]{22,1,55,16,9};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        int res = Arrays.binarySearch(b,16);
        System.out.println(res);

        List<Integer> li = Arrays.asList(new Integer[]{1,2,3,4,5});
        System.out.println(li);

        int resu = Arrays.compare(a,b);
        System.out.println(resu);




    }
}

package Java_Concepts;

import java.util.Arrays;
import java.util.List;

public class Arrayy {

    public static void main(String[] args) {

        int a[] = new int[5];
        a[0] =10;
        a[1] = 20;
        a[2] =30;
        System.out.println(Arrays.toString(a));

        Integer[] i = {100,20,1,30,0};
        System.out.println(Arrays.toString(i));

        int res = Arrays.binarySearch(i,20);
        System.out.println(res);

        Arrays.sort(i);
        System.out.println(Arrays.toString(i));

        int res1 = Arrays.binarySearch(i,20);
        System.out.println(res1);

        String s[] = {"chandrasekar","rajasekar","balaji"};
        System.out.println(s);
        System.out.println(Arrays.toString(s));

        Integer z[] = {11,22,33,44,55,66};
        List<Integer> o = Arrays.asList(z);
        System.out.println(o+""+"---------->  Printed");

        int c1[] = {11,2,3};
        int c2[] = {1,2,3};
        int result =  Arrays.compare(c1,c2);
        System.out.println(result);


    }
}

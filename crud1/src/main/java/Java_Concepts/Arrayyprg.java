package Java_Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arrayyprg {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // 1 kth swap
//        int a1 [] = {1,2,3,4,5};
//        System.out.println("Enter the number");
//        int num1 = sc.nextInt()-1;
//        for (int i=0;i<a1.length;i++)
//        {
//            int temp = a1[num1];
//            a1[num1] = a1[a1.length-(num1+1)];
//            a1[a1.length-(num1+1)] = temp;
//        }
//        System.out.println(Arrays.toString(a1));
//
//        System.out.println("***************** Left Rotating ********************************");
//        int a2 [] = {1,2,3,4,5};
//        int num2 = sc.nextInt();
//        for (int i=0;i<num2;i++)
//        {
//            int temp = a2[0];
//            for (int j=0;j<a2.length-1;j++)
//            {
//                a2[j] = a2[j+1];
//            }
//            a2[a2.length-1] = temp;
//        }
//        System.out.println(Arrays.toString(a2));
//
//        System.out.println("***************** Right Rotating ********************************");
//        int a3 [] = {1,2,3,4,5};
//        int num3 = sc.nextInt();
//        for (int i=0;i<num3;i++)
//        {
//            int temp = a3[a3.length-1];
//            for (int j=a3.length-1;j>0;j--)
//            {
//                a3[j] =a3[j-1];
//            }
//            a3[0] = temp;
//        }
//        System.out.println(Arrays.toString(a3));
//
//        System.out.println("**************Linear search **************");
//        int a4[] = {222,33,1,2,3,4,10,20,17};
//        int num4 = sc.nextInt();
//        for (int i=0;i<a4.length;i++)
//        {
//            if (a4[i] == num4)
//            {
//                System.out.println("Element present in "+i +" position");
//                break;
//            }
//        }

//        System.out.println("****************** Binary Search *************************");
//
//        int a5[] = {22,55,32,65,11,17,10,9};
//        int num5 = sc.nextInt();
//        Arrays.sort(a5);
//        System.out.println(Arrays.toString(a5));
//        int res = binarysearch(a5,num5);
//        if (res!=-1)
//            System.out.println("Element present at "+res +"position");
//        else
//            System.out.println("no element present");
//
//        System.out.println("****************** Bubble sort *************************");
//
//             int a6[] = {22,44,32,166,3,1,26,17};
//             for (int i=0;i<a6.length;i++)
//             {
//                 for (int j =0 ;j<a6.length-1;j++)
//                 {
//                     if (a6[i] < a6[j])
//                     {
//                         int temp = a6[i];
//                         a6[i] = a6[j];
//                         a6[j] = temp;
//                     }
//                 }
//             }
//        System.out.println(Arrays.toString(a6));
//
//        System.out.println("****************** element occurence in Array ****************");
//        int a7[] = {1,2,2,3,5,6,6,6,9,0,2};
//        System.out.println(Arrays.toString(a7));
//        for (int i=0;i<a7.length;i++)
//        {      int count = 1;
//                if(a7[i] == -1)
//                {continue;}
//            for (int j=i+1;j< a7.length;j++)
//            {
//                if (a7[i] == a7[j])
//                {
//                    count = count+1;
//                    a7[j] = -1;
//                }
//            }
//            System.out.println(a7[i] +" presents "+ count +" times");
//        }

//        System.out.println("*******************Remove Duplicates in the Array ");
//        int []a8 = {1,1,1,1,12,2,3,4,22,64,3,4};
//        Arrays.sort(a8);
//        List b = new ArrayList<>();
//        for (int i=0;i<a8.length-1;i++)
//        {
//            if (a8[i] != a8[i+1])
//            {
//               b.add(a8[i]);
//            }
//        }
//        b.add(a8[a8.length-1]);
//        System.out.println(b);

//        System.out.println("Min and max using Array concept");
//        int a9[] = {22,4,3,6,7,545,4,43,1,0};
//        int max = a9[0];
//        int min = a9[0];
//        for (int i=0;i<a9.length;i++)
//        {
//            if(max < a9[i])
//                max = a9[i];
//            if (min>a9[i])
//                min =a9[i];
//        }
//        System.out.println("max====> "+max);
//        System.out.println("min====> "+min);

        System.out.println("Ascending order descending order");

        int a10[] = {22,1,44,5,7,0};
        for (int i=0;i<a10.length;i++)
        {
            for (int j=i+1;j<a10.length;j++)
            {
                if(a10[i]<a10[j])
                {
                    int temp = a10[i];
                    a10[i] = a10[j];
                    a10[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a10));

    }

    private static int binarysearch(int[] a5, int num5) {
      int first = 0;
      int last = a5.length-1;
      int mid = (first+last)/2;
      while(first<=last)
      {
          if(a5[mid] == num5)
          {
              return mid;
          }
          else if(a5[mid]>num5)
          {
              last = mid-1;
          }
          else if (a5[mid]<num5)
          {
              first = mid+1;
          }
          mid = (first+last)/2;
      }
          return -1;
    }


}
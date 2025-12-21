package Java_Concepts;

import java.util.Scanner;

public class javaprogram {
    public static int factrec =1;
    public static int n1=0,n2=1,n3=0;;

    public static void main(String[] args) {

        //print tables
          Scanner sc = new Scanner(System.in);
//        System.out.println("Enter start Number");
//        int start = sc.nextInt();
//        System.out.println("Enter End Number");
//        int End = sc.nextInt();
//        for(int i=1;i<=10;i++)
//        {
//            for(int j=start;j<=End;j++)
//            {
//                System.out.println(i +"*" +j+"=" + i*j);
//            }
//            System.out.println();
//        }
//
//        System.out.println("*******************  //Count the digit  *********************8");
//        System.out.println("Enter the number");
//        int number = sc.nextInt();
//        int count = 0;
//        while(number>0)
//        {
//            number = number/10;
//            count = count+1;
//        }
//        System.out.println(count);
//
//        System.out.println("***************** Factor ******************");
//        System.out.println("Enter the number");
//        int number0 = sc.nextInt();
//        for (int i=1;i<=number0;i++)
//        {
//            if(number0%i==0)
//            System.out.println(i+"is the factor of "+number0);
//        }
//
//        System.out.println("***************** prime number ******************");
//        System.out.println("Enter the number");
//        int number1 = sc.nextInt();
//        int countt = 0;
//        for (int i=1;i<=number1;i++)
//        {
//            countt = countt + 1;
//        }
//        String res = (countt==2)?"Prime Number" : "Not a primr";
//        System.out.println(res);
//
//        System.out.println("***************** reverse the number ******************");
//        System.out.println("Enter the number");
//        int number2 = sc.nextInt();
//        int temp = 0;
//        while(number2>0)
//        {
//            int last = number2 % 10;
//            temp = (temp*10)+ last;
//            number2 = number2/10;
//        }
//        System.out.println(temp);
//
//        System.out.println("***************** Palindrome ******************");
//        System.out.println("Enter the number");
//        int number4 = sc.nextInt();
//        int ori = number4;
//        int temp1 = 0;
//        while(number4>0)
//        {
//            int last = number4 % 10;
//            temp1 = (temp1*10)+ last;
//            number4 = number4/10;
//        }
//        System.out.println(temp1);
//        String res1 = (ori==temp1)?"Palimdrome":"Not palindrome";
//        System.out.println(res1);
//
//        System.out.println("***************** Fibbanoace ******************");
//        System.out.println("Enter the number");
//        int num5 = sc.nextInt();
//        int n1=0,n2=1,n3=0;
//        System.out.print(n1+","+n2+",");
//        for (int i=0;i<num5-2;i++)
//        {
//            n3=n1+n2;
//            System.out.print(n3+",");
//            n1=n2;
//            n2=n3;
//        }
//
//        System.out.println("***************** Xylem number ******************");
//        System.out.println("Enter the number");
//        int num6 = sc.nextInt(); //2233
//        int last = num6%10;
//        num6 = num6/10;
//        int tempp =0;
//        while(num6>9)
//        {
//            tempp = tempp + num6 %10;
//            num6 = num6 /10;
//        }
//        int fh = num6+last;
//        String res6 = (fh == tempp)?"Xylem":"phloem";
//        System.out.println(res6);
//
//        System.out.println("***************** Armstrong number ******************");
//        System.out.println("Enter the number");
//        int num7 = sc.nextInt(); //1+5+3
//        int sum =0,orii=num7;
//        while(num7>0)
//        {
//            int  cube =1;
//            int last1 = num7 % 10;
//            for (int i=0;i<3;i++)
//            {
//                cube = cube * last1;
//            }
//            sum = sum +cube;
//            num7 = num7/10;
//
//        }
//        System.out.println(sum);
//        System.out.println(ori);
//        String res7 = (sum==orii)?"Armstrong":"Not armstrong";
//        System.out.println(res7);
//
//        System.out.println("***************** Strong number ******************");
//        System.out.println("Enter the number");
//        int num8 = sc.nextInt(); //145
//        int sum1 =0,ori1 = num8;
//        while(num8>0)
//        {
//            int last3 = num8 % 10;
//            int fact = 1;
//            for (int i=1;i<=last3;i++)
//            {
//                fact = fact * i;
//            }
//            sum1 = sum1+fact;
//            num8 = num8/10;
//        }
//        String res5 = (ori1 == sum1 ) ? "Strong" : "Not Strong";
//        System.out.println(res5);
//
//        System.out.println("***************** First and Last ******************");
//        System.out.println("Enter the number");
//        int num9 = sc.nextInt();//64664
//        int Last = num9 % 10;
//        while(num9>9)
//        {
//            num9 = num9/10;
//        }
//        System.out.println("First---->"+num9);
//        System.out.println("Last---->"+Last);
//
//        System.out.println("***************** Perfect number ******************");
//        System.out.println("Enter the number");
//        int num10 = sc.nextInt();//6
//        int sum10 =0 ;
//        for (int i = 1;i<num10;i++)
//        {
//            if(num10 % i ==0)
//                sum10 = sum10 + i;
//        }
//        String res10 = (sum10 == num10)?"Perfect": "Not perfect";
//        System.out.println(res10);

        System.out.println("***************** factorial ******************");
        System.out.println("Enter the number");
        int num11 = sc.nextInt();
        int fact1 =1;
        for (int i=1;i<=num11;i++)
        {
            fact1 = fact1*i;
        }
        System.out.println("Factorial is ----->>> "+fact1);

        System.out.println("***************** Factorial using Recursion ******************");
        System.out.println("Enter the number");
        int num12 = sc.nextInt();
        int res12 = factorial(num12);
        System.out.println(res12);


        System.out.println("***************** Fibbanoace using Recursion ******************");
        System.out.println("Enter the number");
        int num13 = sc.nextInt();
        int num13res = num13 -2;
        System.out.println(n1+","+n2+",");
        fibbanoace(num13res);
    }

    public static void fibbanoace(int n)
    {
        if(n>0)
        {
            n3 = n1+n2;
            System.out.println(n3+",");
            n1=n2;
            n2=n3;
            n--;
            fibbanoace(n);
        }
        else {
            return ;
        }
    }

    public static int factorial (int n)
    {
        if(n>0)
        {
            factrec = factrec * n;
            n--;
            factorial(n);
        }
        return factrec;
    }
}

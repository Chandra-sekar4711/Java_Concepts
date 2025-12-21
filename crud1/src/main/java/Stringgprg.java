import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Stringgprg {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Basic wormup
        //char Array to String
//        char ch[] = {1,2,3,4,5};
//        String s1 = new String(ch)
//        System.out.println(s1);
//
//        //int a[] to String
//        int a[] = {12,2,1};
//        String s2 = "";
//        for (int i=0 ;i<a.length;i++)
//        {
//            s2 =s2+a[i];
//        }
//        System.out.println(s2);
//
//        //String to charArray
//        String s3 = "hello";
//        char ch1[] = s3.toCharArray();
//        System.out.println(Arrays.toString(ch1));
//
//        //int to String
//        int io =12345;
//        String h = String.valueOf(io);
//        System.out.println(h);
//
//        //String to string[]
//        String sp = "hi hello world";
//        String f[] = sp.split("");
//        System.out.println(Arrays.toString(f));
//
//        //string to stringbuilder
//        String sg = "frog";
//        StringBuilder sb = new StringBuilder(sg);
//        System.out.println(sb);
//
//        //stringbuilder to String
//        String fd =  new String(sb);
//        System.out.println(fd);

        //**************************************** string prg ****************************
        //************palindrome******************
//        System.out.println("Enter the Palindrome string");
//        String s4 =  sc.nextLine();
//        String res = "";
//        for (int i= s4.length()-1;i>=0;i--)
//        {
//            res = res+s4.charAt(i);
//        }
//        String resu = (s4.equalsIgnoreCase(res))?"Palindrome":"Not Palindrome";
//        System.out.println(resu);
//
//        //************Count the character ******************
//        System.out.println("Enter the  string to find Count the character");
//        String s5 = sc.nextLine();
//        char ch5[] = s5.toCharArray();
//        int C = 0,s=0,N=0,S = 0;
//        for (int i=0;i<s5.length();i++)
//        {
//            if (ch5[i]>='A' && ch5[i]<='Z')
//            {
//                C++;
//            }
//            else if (ch5[i]>='a' && ch5[i]<='z')
//            {
//                s++;
//            }
//            else if (ch5[i]>='0' && ch5[i]<='9')
//            {
//                N++;
//            }
//            else{
//                S++;
//            }
//
//        }
//        System.out.println(C+""+s+""+N+""+S);
//
//        //************Count the Integer in the String ******************
//        System.out.println("Enter the  string to sum the Integer");
//        String s6 = sc.nextLine();
//        char ch2[] = s6.toCharArray();
//        int sum =0;
//        for (int i=0;i<ch2.length;i++)
//        {
//            if (ch2[i]>='0' && ch2[i]<='9')
//            {
//                sum = sum+ch2[i]-'0';
//
//            }
//        }
//        System.out.println(sum);
//
//        System.out.println("Enter the  string");
//
//        //************Convert ltoU and vicevers g ******************
//        System.out.println("Enter the  string to Lower and Upper case");
//        String s7 = sc.nextLine();
//        char ch7[] = s7.toCharArray();
//        String res1 = "";
//        for (int i=0;i<ch7.length;i++)
//        {
//            if (ch7[i]>='A' && ch7[i]<='Z')
//            {
//                res1 = res1+(char)(ch7[i]+32);
//            }
//            if (ch7[i]>='a' && ch7[i]<='z')
//            {
//                res1 = res1+(char)(ch7[i]-32);
//            }
//        }
//        System.out.println(res1);
//
//        //************    Anagram ******************
//        System.out.println("Enter the 1st string to find Anagram");
//        String s01 = sc.nextLine();
//        System.out.println("Enter the 2nd string to find Anagram");
//        String s02 = sc.nextLine();
//        String su1 =s01.toUpperCase();
//        String su2 = s02.toUpperCase();
//        char c1[] = su1.toCharArray();
//        char c2[] = su2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        boolean b = false;
//        if (c1.length != c2.length)
//        {
//            System.out.println("Not an Anagram");
//        }
//        else {
//            for(int i=0;i<c1.length;i++)
//            {
//                if(c1[i]!=c2[i])
//                {
//                    b=true;
//                    System.out.println("Not Anagram");
//                }
//            }
//            if (b==false)
//            {
//                System.out.println("Anagram");
//            }
//        }
//
//        //************    Reverse the String for Even Position  ******************
//        System.out.println("Reverse the String for Even Position");
//        String s8 = sc.nextLine();
//        String[] sa = s8.split(" ");
//        String rres = "";
//        for (int i=0;i<sa.length;i++)
//        {
//            if (i%2!=0)
//            {
//                rres = rres + reverse(sa[i])+" ";
//            }
//            else {
//                rres =rres +sa[i]+" ";
//            }
//        }
//        System.out.println(rres);
//
//        //************   Reverse the particular string ******************
//        System.out.println("Reverse the particular string ");
//        String s9 = sc.nextLine();
//        String ss[] = s9.split(" ");
//        String re = "";
//        for (int i=0;i<ss.length;i++)
//        {
//            if (ss[i].equals("Love"))
//            {
//             re=re+"Hate"+" ";
//            }
//            else if (ss[i].equals("Biryani"))
//            {
//                re=re+"CurdRice"+" ";
//            }
//            else {
//                re = re+ss[i];
//            }
//        }
//        System.out.println(re);

        //************  First Repeated character in a string ******************
//        System.out.println("First Repeated character in a string");
//        System.out.println("Enter the String");
//        String str = sc.nextLine();
//        char chh[] = str.toCharArray();
//        boolean b = false;
//        for (int i=0;i<chh.length;i++)
//        {
//           b= false;
//            for (int j=i+1;j<chh.length;j++)
//            {
//                if(chh[i]==chh[j])
//                {
//                    System.out.println(chh[i]+" is the 1st repeated char in the string");
//                    b=true;
//                    break;
//                }
//            }
//            if(b)
//                break;
//        }
//        if (b==false)
//        {
//            System.out.println("no Repeated char in this String");
//        }

        //************  First Non Repeated character in a string ******************
        System.out.println("First Non Repeated character in a string");
        System.out.println("Enter the String");
        String str1 = sc.nextLine();// abcadebcd
        char ci1[] = str1.toCharArray();
        boolean flag=false;
        for (int i=0;i<ci1.length;i++)
        {
            boolean bi1= false;
            for (int j=0;j<ci1.length;j++)
            {
                if (ci1[i] == ci1[j] && i!=j)
                {
                   bi1=true;
                    break;
                }
            }
            if(bi1==false)
            {
                System.out.println(ci1[i]+ " is first non repeated character");
                flag =true;
                break;
            }
        }
        if (flag==false)
        {
            System.out.println("All characters are repeated ");
        }

        //************  First Non Repeated character in a string Method 2  ******************
        System.out.println("First Non Repeated character in a string method 2");
        System.out.println("Enter the String");
        String strr = sc.nextLine();
        StringBuilder sb =  new StringBuilder(strr);
        int length  = sb.length();

        for (int i=0;i<length;i++)
        { boolean b= false;
            for (int j=i+1;j<length;j++)
            {
                if (sb.charAt(i)==sb.charAt(j))
                {
                    sb.deleteCharAt(j);
                    b=true;
                     length--;
                }
            }
            if (b==false)
            {
                System.out.println(sb.charAt(i)+" is first non repeated character in the String");
            }
        }

        //************  Delete Duplicate in the string  ******************
        System.out.println("Delete Duplicate in the string");
        System.out.println("Enter the String");
        String ll = sc.nextLine();
        StringBuffer sbb = new StringBuffer(ll);
        int length1 = sbb.length();
        for (int i=0;i<length1;i++)
        {
            for (int j=0;j<length1;j++) {
                if (sbb.charAt(i) == sbb.charAt(j))
                {
                    sbb.deleteCharAt(j);
                    length1--;
                }
            }
        }
        System.out.println(sb);















    }

    public static  String reverse(String s)
    {
        String res = "";
        for (int i=s.length()-1;i>=0;i--)
        {
            res=res+s.charAt(i);
        }
        return res;
    }
}

package Java_Concepts;

import com.crud1.Sample.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class Conversions {

    public static void main(String[] args) {

        System.out.println("*******************Array to ArrayList nad Viceversa***********************");

        Integer a[] = {1,2,3,4,5};
        List<Integer> al = new ArrayList<>();
        List l = Arrays.asList(a);
        System.out.println(l);

        Integer a1[] = {100,200};
        List<Integer> al1 = new ArrayList<>();
        for (Integer i :a1)
        {
            al1.add(i);
        }
        System.out.println(al1);

        String h1[] = {"abc","def"};
        List<String> sl = new ArrayList<>();
        for (String i1:h1)
        {
            sl.add(i1);
        }
        System.out.println(sl);

        List<String> sl1 = Arrays.asList(h1);
        System.out.println(sl1);

        /* Arraylist to array*/
        List a2 = List.of("Sekar","abc","def");
        Object[] oa = a2.toArray();
        System.out.println(oa[2]);

        List<Integer> li = new ArrayList<>();
        li.add(100);
        li.add(200);
        li.add(300);

        Integer[] op =  new Integer[li.size()];
        for (int i=0;i<li.size();i++)
        {
            op[i] = li.get(i);
        }
        System.out.println(Arrays.toString(op));

        System.out.println("*****************Array to string and vice cersa***********************");
         int q[] = {11,22,33};
         String s = "";
         for (int i=0;i<q.length;i++)
         {
             s= s+q[i];
         }
        System.out.println(s+"--> ok ");

        String[] sa = {"arun", "Ramesh"};
        String se = String.join(",", sa);
        System.out.println(se);

        //Integer String to array
        String sii = "123456";
        int ip = Integer.parseInt(sii);
        System.out.println(ip);

        String so ="1234";
        int d[] =  new int[so.length()];
        for (int i=0;i<so.length();i++)
        {
           d[i] = so.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(d));

        //char string to array
        String sd = new String("vinothkumar");
        char[] chh = new char[sd.length()];
        for (int i=0;i<sd.length();i++)
        {
            chh[i] = sd.charAt(i);
        }
        System.out.println(chh[2]);

        char ch1[] = sd.toCharArray();
        System.out.println(ch1[3]);

        //String to string array
        String sa1 ="hi how are you";
        String[] resu = sa1.split(" ");
        System.out.println(resu[1]);

        System.out.println("*****************Wrapper class conversion***********************");
        //primitive to non primitive

        int q1 =100;
        Integer ff = Integer.valueOf(q1);
        System.out.println(ff);

        int q2 = 200;
        Integer q2res = q2;
        System.out.println(q2res);

        Integer sd1 = 101;
        int sd1res =   sd1.intValue();
        System.out.println(sd1res);

        Integer sd2 = 101;
        int yu = sd2;
        System.out.println(yu);

        //String to int and int to String
         String h11 = "101202";
         int y = Integer.parseInt(h11);
        System.out.println(y+1);

        int qw = 1000;
        String oi = String.valueOf(qw);
        System.out.println(oi+1);

        System.out.println("*****************************ArrayList to set ******************************************");
        List<Integer> kk =  new ArrayList<>();
        kk.add(10);
        kk.add(10);
        kk.add(30);
        Set see = new HashSet<>(kk);
        System.out.println(see);

        List<Integer> et = new ArrayList<>(see);
        System.out.println(et);

        System.out.println("*****************************ArrayList to Map****************");
        List jh =  List.of("chandrasekar","Rajasekar","Balaji");
        int u =0;
        Map<Integer,Object> sk = new Hashtable<>();
        for (int i=0;i<jh.size();i++)
        {
            sk.put(u,jh.get(i));
            u++;
        }
        System.out.println( sk);

        Collection cc = sk.values();
        System.out.println(cc);

        System.out.println("**************************Map to Entity*********************");
        Map<String,Object> hm1 = new HashMap();
        hm1.put("name","chandrasekar");
        hm1.put("age",26);
        hm1.put("address","Pochampalli");
        System.out.println(hm1);

        ObjectMapper obj = new ObjectMapper();
        Student ooo = obj.convertValue(hm1, Student.class);
        System.out.println(ooo);


        Map<String,Object> kf = obj.convertValue(ooo,Map.class);
        System.out.println(kf.get("age"));























    }
}

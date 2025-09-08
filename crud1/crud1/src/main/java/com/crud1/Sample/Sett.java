package com.crud1.Sample;
import java.util.*;
public class Sett {
    static int number =1;
    public static void  forloop(int num)
    {
        if(number != 101)
        {
            System.out.println(number);
            number = num+1;
            forloop(number);
        }
    }
    public static void main(String[] args) {


            forloop(number);

        Set s = new HashSet<>();
        s.add(10);
        s.add("sekar");
        s.add(20);
        s.add("chandran");
        System.out.println(s);

        if(s.remove(20))
        {
            s.add(2000);
        }
        System.out.println(s);

        Set s2 = new HashSet();
        s2.add(11);
        s2.add(22);
        s2.add(33);
        s2.add(s);
        System.out.println(s2);

        s2.remove(s);
        System.out.println(s2);

       Iterator is = s2.iterator();
       while(is.hasNext())
       {
           System.out.println(is.next());
       }

        System.out.println("**************************************LINKED HASHSET**********************");

       Set lhs = new LinkedHashSet<>();
       lhs.add("Rohit");
       lhs.add("dhoni");
       lhs.add(10);
       lhs.add("virat");
       lhs.add("virat");
       System.out.println(lhs);

        System.out.println("**************************************TREE HASHSET**********************");

    Set<Object> s3 = new TreeSet();
    s3.add(101);
    s3.add(102);
    s3.add(103);
    s3.add(103);
    System.out.println(s3);


        System.out.println("<<<<<<<<<<<<<<<<<<<-------------->>>>>>>>>>>>>>>>>>>>>");

        Teacher se1 = new Teacher("Sekar",24,"pochampalli","IT");
        Teacher se2 = new Teacher("Sekar",25,"pochampalli","IT");

        Set<Teacher> obj = new HashSet<>();
        obj.add(se1);
        obj.add(se2);

        System.out.println(se1.hashCode());
        System.out.println(se2.hashCode());

        System.out.println(se1.equals(se2));

        System.out.println(obj.size());



    }

    //COmpatre
}

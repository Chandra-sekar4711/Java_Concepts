package Java_Concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylistt {
    public static void main(String[] args) {

        List l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(40);

        System.out.println(l);

        l.set(2,30);
        System.out.println(l);

        l.remove(2);
        System.out.println(l);

        l.add(1,15);
        System.out.println(l);

        List l2 = new ArrayList<>();
        l2.add(100);
        l2.add(200);
        l2.add(300);
        System.out.println(l2);

       l.addAll(1,l2);
        System.out.println(l);

        l.set(4,400);
        System.out.println(l);

        l.removeAll(l2);
        System.out.println(l);

        List l3 = new ArrayList();
        l3.add(11);
        l3.add(22);

        l.add(l3);
        System.out.println(l);

        System.out.println(l.contains(l3));

        System.out.println(l.isEmpty());

        System.out.println(l.indexOf(400));

       List<String> s1 = new ArrayList<>();
       s1.add("12");
       s1.add("11");
       System.out.println(s1.indexOf(String.valueOf(12)));

       System.out.println( s1.get(1));

        System.out.println(l2.size());

        System.out.println("******************");
        Iterator ii = s1.iterator();
        while (ii.hasNext())
        {
            System.out.println(ii.next());
        }

        System.out.println("*****************************************************");

        List ll = new LinkedList();
        ll.add("99");
        ll.add("89");
        ll.add("79");
        System.out.println(ll);

        ll.set(0,100);
        System.out.println(ll);

        System.out.println( ll.get(2));








    }
}

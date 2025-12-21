package Java_Concepts;

import com.crud1.Sample.Teacher;

import java.util.*;

public class sett {

    public static void main(String[] args) {

        Set s = new HashSet<>();
        s.add(10);
        s.add("Rajasekarbalajiperiyasami");
        s.add(10);
        s.add(30);
        s.add(40);
        s.add("sekar");
        System.out.println(s);

        Iterator set = s.iterator();
        while (set.hasNext())
        {
            if (set.next().equals("sekar"))
            {

                set.remove();
                s.add(22);
            }
        }
        System.out.println(s);

        s.remove(22);
        System.out.println(s);

        System.out.println("****************Linked Hashset*********************");

        Set ls = new LinkedHashSet();
        ls.add(100);
        ls.add(300);
        ls.add(200);
        ls.add(100);
        System.out.println(ls);

        System.out.println("****************Tree Hashset*********************");

        Set ts = new TreeSet();
        ts.add("chandrasekar");
        ts.add("rajasekar");
        ts.add("1balaji");
        ts.add("Balaji");
        System.out.println(ts);


        System.out.println("<<<<<<<<<<<<<<<<<<<-------------->>>>>>>>>>>>>>>>>>>>>");

        Teacher se1 = new Teacher("Sekar",24,"pochampalli","IT");
        Teacher se2 = new Teacher("Sekar",24,"pochampalli","IT");

        Set<Teacher> tt = new HashSet<>();
        tt.add(se1);
        tt.add(se2);
        System.out.println(tt);






    }
}

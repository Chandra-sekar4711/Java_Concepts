package com.crud1.Sample1;

import com.crud1.Sample.Teacher;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class settt {
    public static void main(String[] args) {
        Set<String> sg = new HashSet<>();
        sg.add("apple");
        sg.add("Boy");
        sg.add("apple");
        sg.add("Cat");
        System.out.println(sg);

        //get
        Iterator i = sg.iterator();
        while(i.hasNext())
        {
            Object o =i.next();
            if (o.equals("Boy"))
            {
                i.remove();

            }
        }
        System.out.println(sg);
        sg.add("New Babyboy");
        System.out.println(sg);

       // --------------------------------------- Linked Hashset ----------------------------------

        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(30);
        lhs.add(20);
        lhs.add(10);
        System.out.println(lhs);




        System.out.println("<<<<<<<<<<<<<<<<<<<------TreeSet-------->>>>>>>>>>>>>>>>>>>>>");
        Teacher se1 = new Teacher("Sekar",24,"pochampalli","IT");
        Teacher se2 = new Teacher("Sekar",24,"pochampalli","IT");

        Set<Teacher> lhs1 = new LinkedHashSet<>();
        lhs1.add(se1);
        lhs1.add(se2);
        System.out.println(lhs1);



    }
}

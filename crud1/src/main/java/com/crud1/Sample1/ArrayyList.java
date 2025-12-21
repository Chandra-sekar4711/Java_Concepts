package com.crud1.Sample1;

import com.crud1.Sample.Student;

import java.text.Collator;
import java.util.*;

public class ArrayyList {

    public static void main(String[] args) {

        List al = new ArrayList();
        al.add(10);
        al.add(100);
        al.add("sekar");
        al.add("50");
        System.out.println(al);

        //get
        System.out.println(al.get(2));

        //getinde
        System.out.println(al.indexOf(10));

        //insert
        al.set(1, 20);
        System.out.println(al);

        //remove
        al.remove(2);
        System.out.println(al);

        al.remove("50");
        System.out.println(al);

        //===========================================

        List<String> l2 = new ArrayList<>();
        l2.add("Arun");
        l2.add("Aravind");
        l2.add("Naveen");
        l2.add("kumar");

        al.add(l2);
        System.out.println(al);

        al.addAll(l2);
        System.out.println(al);

        al.set(3, "Arunan");
        System.out.println(al);
        al.removeAll(l2);
        System.out.println(al);

        al.remove(2);
        System.out.println(al);

        al.remove(Integer.valueOf(20));
        System.out.println(al);

        boolean b1 = al.contains("Arunan");
        System.out.println(b1);

        System.out.println(al.size());

//      al.clear();
        System.out.println(al);

        List k1 = new ArrayList<>();
        k1.add("Krishna");
        k1.add("Moorthy");
        k1.add("Gowri");
        k1.add("Ammal");

        Iterator i = k1.iterator();
        while (i.hasNext()) {
            Object Avail = i.next();
            if (Avail.equals("Ammal")) {
                i.remove();
            }
        }
        System.out.println(k1);

        System.out.println(al.isEmpty());

        List<Integer> l1 = new ArrayList<>(List.of(22,2,10,66));
        Collections.sort(l1);
        System.out.println(l1);

        Student s1 = new Student("Chandra",26,"pochampalli","IT");
        Student s2 = new Student("Raja",24,"pochampalli","IT");
        Student s3 = new Student("Balaji",22,"pochampalli","IT");
        List<Student> com = new ArrayList<>(List.of(s1,s2,s3));
        Collections.sort(com);
        System.out.println(com);

        System.out.println("Sort by name");
        com.stream().sorted(Comparator.comparing(Student::getName)).forEach(n-> System.out.println(n));








    }
}

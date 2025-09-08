package com.crud1.Java8.Optional;

import com.crud1.CustomException.MyException;
import com.crud1.Sample.Student;

import java.util.List;
import java.util.Optional;

sealed  public class Optionalsample permits c1{

    public static void main(String[] args) {
        //Creation usig Optional.of --->returns null pointer exception suddenly if it is null else give unwrapped Object
        Optional<String> os = Optional.of("Chandrasekar");
        System.out.println(os);

        List<String> ss = List.of("balaji","bala");

        Optional<List<String>> ols = Optional.of(ss);
       ols.ifPresent((n)->{
           n.stream().map((n1)->"This is list of"+n1).forEach(n2-> System.out.println(n2));
       });

       //Creation using Ofnullable -->returns value if present,if value is null then return Optional.empty()
        String h= null;
        String s1 = Optional.ofNullable(h).orElse("It is null");
        System.out.println(s1);

        List<String> ls = Optional.ofNullable(List.of("cse","EEE")).orElse(List.of("cse","EEE"));
        //(or)
        Optional<List<String>> ls1 = Optional.ofNullable(null);
        ls1.ifPresent(n->n.forEach(n1-> System.out.println(n1)));

        System.out.println(ls1);

        //Geting operation using Optional
        Student stud1 = new Student("ITArun",10,"thirunveli","IT");
        Student obj = Optional.ofNullable(stud1).get();
        System.out.println(obj);
        System.out.println("*********************************************");

        //orElse()----->note: the default value is always created, even if not needed.

        Optional<String> value = Optional.of("hi");
        value.orElse("Default Value");
        System.out.println(value); // "Default Value"

        //orElseGet()

        String value1 = Optional.<String>ofNullable(null)
                .orElseGet(() -> "Default from Supplier");
        System.out.println(value1); // "Default from Supplier"


        //orElseThrow()
        String dd = null;
        String lk = Optional.ofNullable(dd).orElseThrow(()->new RuntimeException("Exception da mapla"));
        System.out.println(lk);
       // lk.ifPresent(n-> System.out.println(n.toUpperCase()));


    }

}

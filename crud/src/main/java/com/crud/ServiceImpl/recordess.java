package com.crud.ServiceImpl;

import com.crud.Model.StudentModel;
import com.crud.Service.Sample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class recordess {

    public static void main(String[] args) {

        Sample res = (s) -> {
            return s + "Welkom";
        };

        String op = res.add("chandrasekar");
        System.out.println(op);

        Sample res1 = new Sample() {
            @Override
            public String add(String s) {
                return "Anonymous "+s;
            }

        };

        String op2 =res1.add("Rajasekar");
        System.out.println(op2);


    }
}
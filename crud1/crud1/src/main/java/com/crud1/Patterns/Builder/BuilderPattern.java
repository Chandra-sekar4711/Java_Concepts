package com.crud1.Patterns.Builder;

public class BuilderPattern {


    public static void main(String[] args) {
        //Manual builder--->return type BuilderStudent ,-->calling class using classname -->BuilderStudent.Builder and create an object with new keyword
        BuilderStudent sb = new BuilderStudent.Builder(1,"sekar").setSdept("IT").build();
        System.out.println(sb);
        //Lombok builder annotation
        //BuilderStudent sb1 = BuilderStudent.builder().sname("BalaRaja").build();


    }
}

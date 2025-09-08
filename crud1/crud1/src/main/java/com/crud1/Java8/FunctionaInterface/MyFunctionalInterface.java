package com.crud1.Java8.FunctionaInterface;

@FunctionalInterface
public interface MyFunctionalInterface {

    void sum(int num);

    public static void print()
    {
        System.out.println("This is method of MyFunctionalInterface");
    }

}

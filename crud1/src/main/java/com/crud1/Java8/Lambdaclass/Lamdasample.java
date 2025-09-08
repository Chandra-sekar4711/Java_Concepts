package com.crud1.Java8.Lambdaclass;

import com.crud1.Java8.FunctionaInterface.MyFunctionalInterface;


public class Lamdasample {

    public static void main(String[] args) {
        String s = """
                name:"chsbdjk",
                     age:26
                """;
        System.out.println(s);
        Anonymous_Before_Java8();
        Anonymous_After_Java8_IS_Lambda();

    }

    //Lambda---->we can also anotate @FunctionalInterface in the Java 8+ to create an Functional Interface
    private static void Anonymous_After_Java8_IS_Lambda() {

        MyFunctionalInterface obj = (n)->{System.out.println("Lamda"+200);};
         obj.sum(200);
    }
    public static void Anonymous_Before_Java8()
    {
        MyFunctionalInterface obj1 = new MyFunctionalInterface(){

            @Override
            public void sum(int num) {
                System.out.println("Anonymous"+100+num);
            }
        };
        obj1.sum(5);
    }

}

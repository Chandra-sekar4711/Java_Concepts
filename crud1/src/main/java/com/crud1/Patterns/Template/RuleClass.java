package com.crud1.Patterns.Template;

public abstract class RuleClass {

    public RuleClass()
    {

    }
    public void cooking()
    {
        buy();
       eat();
       Sleep();
    }

    public abstract void buy() ;

    public  void eat(){
        System.out.println("Eating");
    }

    public  void Sleep(){
        System.out.println("sleeping");
    }



}

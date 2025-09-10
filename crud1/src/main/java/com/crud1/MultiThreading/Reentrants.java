package com.crud1.MultiThreading;

public class Reentrants {

    public static synchronized void MethodA()
    {
        for (int i =1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + " is processing Method A" + i);
        }
        MethodB();
    }

    public static synchronized void MethodB()
    {
        for (int i =1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + " is processing Method B" + i);
        }
    }

    public static void main(String[] args) {
        Reentrants obj = new Reentrants();
        Thread t1 = new Thread(()->MethodA(),"Thread 1");
        t1.start();

    }

}

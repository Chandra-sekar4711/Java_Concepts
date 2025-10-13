package com.crud1.MultiThreading;

public class ThreadusingThreadclass extends Thread {

    public void run()
    {
        ThreadusingThreadclass.calculate();
    }

    public static void calculate()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("thread " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        ThreadusingThreadclass t1 = new ThreadusingThreadclass();
        t1.setName("t1");
        t1.start();

    }
}

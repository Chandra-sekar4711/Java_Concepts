package com.crud1.MultiThreading;

public class ThreadusingRunnableInterface implements Runnable{


    @Override
    public void run() {
        ThreadusingRunnableInterface.calculate();
    }

    public static void calculate()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Thread "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Runnable obj = new ThreadusingRunnableInterface();
        Thread t1 = new Thread(obj,"T1");
        Thread t2 = new Thread(obj,"T2");
        t1.start();
        t2.start();

    }
}

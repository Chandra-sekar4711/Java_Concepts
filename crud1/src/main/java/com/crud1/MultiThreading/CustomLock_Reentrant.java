package com.crud1.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomLock_Reentrant {

   private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void Method1()
    {
        lock1.lock();
        try{
        for(int i =0;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + i);
        }}
        finally{
            lock1.unlock();
        }
    }

    public void Method2()
    {
        lock1.lock();
        try{
            for(int i =0;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName() + i);
            }}
        finally{
            lock1.unlock();
        }
    }
    public static void main(String[] args) {
        CustomLock_Reentrant obj1 = new CustomLock_Reentrant();
        Thread t1 = new Thread(()->obj1.Method1(),"t1_");
        Thread t2 = new Thread(()->obj1.Method2(),"t2_");
        t1.start();
        t2.start();

    }
}

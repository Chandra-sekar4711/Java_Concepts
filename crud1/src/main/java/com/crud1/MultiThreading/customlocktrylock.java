package com.crud1.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class customlocktrylock {
     private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void add()
    {
        boolean acquired = lock1.tryLock();
        if (acquired) {
            try {
                System.out.println("Adding this number " + Thread.currentThread().getName());
                Thread.sleep(1000); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock1.unlock(); // unlock only if acquired
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " skipped because lock is busy");
        }
    }

    public void sub()
    {
        lock2.lock();
        try {
            System.out.println("Subtracting thsi number "+Thread.currentThread().getName());
        }
        finally{
            lock2.unlock();
        }
    }

    public static void main(String[] args) {
        customlocktrylock obj = new customlocktrylock();
        Thread t1 = new Thread(()->obj.add(),"T1");
        Thread t11 = new Thread(()->obj.add(),"T11");
        Thread t2 = new Thread(()->obj.sub(),"T2");
        t1.start();
        t2.start();
        t11.start();

    }

}

package com.crud1.MultiThreading;

public class SynchronizedBlock_CustomLock {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public void methodA()
    {
        synchronized(lock1){
            for (int i =1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName() + " is processing Method A" + i);
            }
        }
    }
    public void methodB()
    {
        synchronized(lock2){
            for (int i =1;i<=5;i++)
            {
                System.out.println(Thread.currentThread().getName() + " is processing Method B" + i);
            }
        }
    }

    public static void main(String[] args) {

        SynchronizedBlock_CustomLock obj = new SynchronizedBlock_CustomLock();
        Thread t1 = new Thread(()-> obj.methodA(),"Thread 1");
        Thread t2 = new Thread(()-> obj.methodB(),"Thread 2");
        t1.start();
        t2.start();

    }
}

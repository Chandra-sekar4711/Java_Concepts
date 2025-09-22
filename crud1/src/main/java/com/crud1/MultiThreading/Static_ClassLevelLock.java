package com.crud1.MultiThreading;

public class Static_ClassLevelLock {

    public static synchronized void MethodA()
    {
        for (int i =1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + " is processing Method A" + i);
        }
    }

    public synchronized void MethodB()
    {
        for (int i =1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + " is processing Method B" + i);
        }
    }


    public static void main(String[] args) {

        Static_ClassLevelLock obj1 = new Static_ClassLevelLock();
        Thread t1 = new Thread(Static_ClassLevelLock::MethodA,"t1");
        Thread dupt1 = new Thread(Static_ClassLevelLock::MethodA,"dupt1");
        Thread t11 = new Thread(obj1::MethodB,"t11");

        Static_ClassLevelLock obj2 = new Static_ClassLevelLock();
        Thread t2 = new Thread(Static_ClassLevelLock::MethodA,"t2");

        t1.start();
        dupt1.start();
        t11.start();
        t2.start();


    }
}

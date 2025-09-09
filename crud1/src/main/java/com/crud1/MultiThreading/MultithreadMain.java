package com.crud1.MultiThreading;

public class MultithreadMain {

    private void methodA() {
        for (int i =1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + " is processing Method A" + i);
        }
    }

    private void methodB() {
        for (int i =1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + " is processing Method B" + i);

        }
    }

    public static void main(String[] args) {
        MultithreadMain obj1 = new MultithreadMain();
         Thread t1 = new Thread(()->obj1.methodA(),"Thread t1");
         Thread t2 = new Thread(()->obj1.methodB(),"Thread t2");
         t1.start();
         t2.start();

    }
}

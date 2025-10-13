package com.crud1.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Customlockinterceptable {

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void add() throws InterruptedException {
        lock1.lockInterruptibly();
        try{
            System.out.println("Adding two  Numbers");
        }
        finally{
            lock1.unlock();
        }
    }

    public void sub() throws InterruptedException {
        lock2.lockInterruptibly();
        try{
            System.out.println("Subtracting two  Numbers");
        }
        finally{
            lock2.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Customlockinterceptable obj = new Customlockinterceptable();
        Thread t1= new Thread(()-> {try {obj.add();} catch (InterruptedException e) {throw new RuntimeException(e);}},"T1");
        Thread t11 = new Thread(()-> {try {obj.add();} catch (InterruptedException e) {throw new RuntimeException(e);}},"T11");
        Thread t2 = new Thread(()-> {try {obj.sub();} catch (InterruptedException e) {throw new RuntimeException(e);}},"T2");

        t1.start();
        Thread.sleep(3000);
        t11.start();
        t11.interrupt();
        t2.start();

    }

}

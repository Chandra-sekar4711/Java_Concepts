package com.crud1.MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomlockFairness {

    private final Lock lock1 = new ReentrantLock(true);
    private final Lock lock2 = new ReentrantLock(true);

    public void add() throws InterruptedException {
        lock1.lockInterruptibly();
        try {
            System.out.println("Fair lock acquired by Thraed"+ Thread.currentThread().getName());
        }
        finally
        {
            lock1.unlock();
        }
    }

    public static void main(String[] args) {
        CustomlockFairness obj = new CustomlockFairness();
        Thread t1 = new Thread(()-> {
            try {
                obj.add();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"T1");
        Thread t2 = new Thread(()-> {
            try {
                obj.add();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"T2");
        Thread t3 = new Thread(()-> {
            try {
                obj.add();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"T3");
        Thread t4 = new Thread(()-> {
            try {
                obj.add();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"T4");
        Thread t5 = new Thread(()-> {
            try {
                obj.add();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"T5");
        Thread t6 = new Thread(()-> {
            try {
                obj.add();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"T6");
        t1.start();
        t2.start();
        t3.start();
        t6.start();
        t5.start();
        t4.start();
    }
}

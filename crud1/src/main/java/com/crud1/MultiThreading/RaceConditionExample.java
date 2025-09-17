package com.crud1.MultiThreading;

import java.util.concurrent.*;

public class RaceConditionExample {
    private volatile  static int counter = 0;  // shared resource

    public   void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        RaceConditionExample rc = new RaceConditionExample();
        for (int i = 0; i < 1000; i++) {
            executor.submit(()->rc.increment());
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Final counter: " + counter);
    }
}

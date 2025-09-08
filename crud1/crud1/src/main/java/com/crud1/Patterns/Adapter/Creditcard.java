package com.crud1.Patterns.Adapter;
//Existing old legacy method
public class Creditcard implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("This is Existing payment method --->"+amount);
    }
}

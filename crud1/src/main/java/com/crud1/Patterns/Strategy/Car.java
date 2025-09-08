package com.crud1.Patterns.Strategy;

public class Car implements Transport{
    @Override
    public void travel(String obj) {
        System.out.println("Travel through "+obj);
    }
}

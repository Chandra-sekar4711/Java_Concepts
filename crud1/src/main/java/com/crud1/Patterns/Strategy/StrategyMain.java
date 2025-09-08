package com.crud1.Patterns.Strategy;

public class StrategyMain {

    public static void main(String[] args) {
        TravelChoicer tc = new TravelChoicer(new Car());
        tc.travelway("carTravel");
        TravelChoicer tb = new TravelChoicer(new Bus());
        tc.travelway("busTravel");

    }
}

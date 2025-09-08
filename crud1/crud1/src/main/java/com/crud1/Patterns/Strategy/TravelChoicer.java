package com.crud1.Patterns.Strategy;

public class TravelChoicer {

    Transport tobj ;

    public TravelChoicer(Transport transport)
    {
            this.tobj=transport;
    }

    public void travelway(String obj)
    {
        tobj.travel(obj);
    }

}

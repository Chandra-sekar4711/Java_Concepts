package com.crud1.Patterns.Adapter;

public class GpayAdapter implements Payment{

    public Gpay gpayobj;

    public GpayAdapter(Gpay gpayobj){
            this.gpayobj = gpayobj;
    }


    @Override
    public void pay(int amount) {
        gpayobj.sendPayment(amount);
    }
}

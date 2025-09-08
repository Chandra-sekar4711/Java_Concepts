package com.crud1.Patterns.Adapter;

public class AdapterMain  {

    public static void main(String[] args) {
        Payment cobj = new Creditcard();
        cobj.pay(1000);

        Payment gobj = new GpayAdapter(new Gpay());
        gobj.pay(2000);
    }
}

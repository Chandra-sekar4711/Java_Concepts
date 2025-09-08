package com.crud1.Patterns.Proxy;

public class ATM implements BankDetail {

    private int atmamount;
    private String atmname;

    public ATM() {

    }


    @Override
    public void details(int amount) throws Exception {
        if(amount==0)
        {
            throw new Exception("Amount is insufficient");
        }
        System.out.println("its ok");
        Bank b = new Bank();
        b.details(amount);


    }
}

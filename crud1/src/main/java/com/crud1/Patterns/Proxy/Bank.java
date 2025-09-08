package com.crud1.Patterns.Proxy;

import lombok.Data;

@Data
public class Bank implements BankDetail{

    private int amount = 500 ;


    public Bank(){

    }




    @Override
    public void details(int amt) {
        amount=amount+amt;
        System.out.println("The account holder Total balance is "+amount);
    }


}

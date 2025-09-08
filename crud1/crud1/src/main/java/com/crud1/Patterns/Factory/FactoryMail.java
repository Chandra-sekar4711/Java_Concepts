package com.crud1.Patterns.Factory;

public class FactoryMail {
    //this is simple factory pattern
    //also have abstact pattern in that factoryMail be Interface and it have a concerete class(FactorySendgris implements factoryMail,FactorySMTP implements factoryMail) implemention this interface
    public Mail getMail(String type )
    {
        if(type.equals("smtp") )
        {
            return new SmtpMail();
        }
        else if(type.equals("sendgrid")) {
            return new Sendgrid();
        }

        return null;
    }

}

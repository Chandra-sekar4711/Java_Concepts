package com.crud1.Patterns.Factory;

public class SmtpMail implements Mail {
    int id;
    String name;
    int cost;

    public SmtpMail(){}
    public void setSmtpMail(int id, String name, int cost)
    {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public void sendmail() {
        System.out.println("SMTPMAIL{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}');
    }

}

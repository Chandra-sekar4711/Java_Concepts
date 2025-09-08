package com.crud1.Patterns.Factory;

public class Sendgrid implements Mail {
    int id;
    String name;
    int cost;

    public Sendgrid(){}
    public void setSendgrid(int id, String name, int cost)
    {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public void sendmail() {
        System.out.println("SENDGRID{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}');
    }
}

package com.crud1.Sample;

import lombok.ToString;
import org.springframework.http.server.DelegatingServerHttpResponse;

import java.util.Objects;

@ToString
public class Teacher {

    String name ;
    int age;
    String address ;
    String job;

    public Teacher(){}

    public Teacher(String name, int age, String address, String job) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString()
    {

        return this.name +" "+this.age;
    }

    public boolean equals(Object o )
    {
        Teacher obj = (Teacher)o;
        return this.name.equals(obj.name) &&  this.address.equals(obj.address) &&  this.job.equals(obj.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, job);
    }
}

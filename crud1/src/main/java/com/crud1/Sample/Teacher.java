package com.crud1.Sample;

import java.util.Objects;

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

    @Override
    public int hashCode() {
       return Objects.hash(name,age,address,job);
    }

    public boolean equals(Object o)
    {
        if(o!=null)
        {
            Teacher obj = (Teacher)o;
            if(this.name.equals(obj.name) && this.age==obj.age && this.job.equals(obj.job) && this.address.equals(obj.address))
            {
                return true;
            }
            else{
                return false;
            }

        }
        return false;
    }
}

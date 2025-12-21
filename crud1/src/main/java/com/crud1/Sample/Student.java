package com.crud1.Sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Comparable{
    String name ;
    int age;
    String address ;
    String job;


    @Override
    public int compareTo(Object o) {
        Student obj = (Student) o;
        if (this.age == obj.age) {
            return 0;
        }
        else if(this.age > obj.age)
        {
            return 1;
        }
        return -1;
    }
}

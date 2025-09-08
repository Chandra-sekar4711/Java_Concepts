package com.crud1.Patterns.Singleton;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Singletonn implements Cloneable{

    private static Singletonn obj  = new Singletonn();

    private Singletonn()
    {

    }

    public static Singletonn method1()
    {
        return obj;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Singletonn obj = Singletonn.method1();
        Singletonn obj1 = (Singletonn) obj.clone();
        System.out.println(obj);
        System.out.println(obj1);

    }

    @Override
    public Singletonn clone() {
        try {
            Singletonn clone = (Singletonn) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}

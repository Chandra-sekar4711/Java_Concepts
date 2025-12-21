package Java_Concepts;

import java.util.Stack;

public class Stackk {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.add(100);
        s.add(200);
        s.add(300);

        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s);

        System.out.println("*********************");
        for (Integer i : s)
        {
            System.out.println(i);
        }


    }
}

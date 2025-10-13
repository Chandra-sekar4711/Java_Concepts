package com.crud1.MultiThreading;

public class NonStatic_Methodlock extends MultithreadMain implements Runnable{

    private  Runnable method;

    public NonStatic_Methodlock()
    {

    }

    public NonStatic_Methodlock(Runnable method)
    {

        this.method = method;
    }

    private synchronized void methodA() {
        for (int i =1;i<=3;i++)
        {
            System.out.println(Thread.currentThread().getName() + " is processing Method A" + i);
        }
    }
     //both MethodA and Method B are same syntaxtically it different
    private void methodB() {
        synchronized (this){
        for (int i =1;i<=3;i++)
        {
            System.out.println(Thread.currentThread().getName() + " is processing Method B" + i);

        }}
    }

    private void methodC() {
        for (int i =1;i<=3;i++)
        {
            System.out.println(Thread.currentThread().getName() + " is processing Method c" + i);
        }
    }


    @Override
    public void run() {

        method.run();
    }


    public static void main(String[] args) {
        NonStatic_Methodlock m1 = new NonStatic_Methodlock();
        Thread t1 = new Thread(m1::methodA);
        Thread t2 = new Thread(()->m1.methodB());
        Thread t3 = new Thread(()->m1.methodC());
        NonStatic_Methodlock m2 = new NonStatic_Methodlock();
        Thread t4 = new Thread(m2::methodA);
         t1.start();
         t1.setName("t1");
         t2.start();
         t2.setName("t2");
         t3.start();
         t3.setName("t3");
         t4.setName("t4");
         t4.start();
    }

}

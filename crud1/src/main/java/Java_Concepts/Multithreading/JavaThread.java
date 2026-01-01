package Java_Concepts.Multithreading;

public class JavaThread implements Runnable{

    public void run()
    {
        m1();
    }
    public static void m1()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Thread -->"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        //extends Thread
//        Thread thread1 = new JavaThread();
//        thread1.setName("t1");
//        thread1.start();
//        Thread thread2 = new JavaThread();
//        thread2.setName("t2");
//        thread2.start();


        //implements Runnable
        Runnable r = new JavaThread();
        Thread thread1 = new Thread(()->JavaThread.m1(),"t1");
        thread1.start();

        Thread thread2 = new Thread(r);
        thread2.setName("t2");
        thread2.start();



    }
}

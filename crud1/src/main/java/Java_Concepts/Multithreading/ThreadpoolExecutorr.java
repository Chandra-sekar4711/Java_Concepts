package Java_Concepts.Multithreading;

import java.util.concurrent.*;

public class ThreadpoolExecutorr
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exe1 = new ThreadPoolExecutor(10, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() );
        for (int i = 0; i < 3; i++) {
//            exe1.execute(ThreadpoolExecutorr::m1);
//            System.out.println("***********************************************");

        }

        ThreadpoolExecutorr obj = new ThreadpoolExecutorr();

        Future<Integer> res = exe1.submit(()->obj.m2(55));
        System.out.println(res.get());
    }

    public static void m1(){
       for (int i=0;i<=5;i++)
       {
           System.out.println(Thread.currentThread().getName());
       }

    }

    public static Integer m2(int num){
        for (int i=0;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName() + "" + num);
        }
       return 10;
    }
}

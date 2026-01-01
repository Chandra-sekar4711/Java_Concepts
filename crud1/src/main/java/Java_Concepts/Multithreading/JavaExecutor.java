package Java_Concepts.Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JavaExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Executors with execute()
//        ExecutorService exe = Executors.newFixedThreadPool(5);
//        for (int i=0;i<5;i++){
//        exe.execute(()->{
//                System.out.println("*************************************************");
//            for(int j=0;j<5;j++)
//            {
//
//                System.out.println("Thread ---> " + Thread.currentThread().getName() );
//            }
//
//        });}


        //Executors with submit() which returns result
        ExecutorService exe1 = Executors.newFixedThreadPool(4);
        for (int i=0;i<5;i++){
            Future<Integer> res = exe1.submit(()->{
                System.out.println("*************************************************");
                System.out.println("Thread Name --->>"+Thread.currentThread().getName());
                return 10;
            }
            );
            System.out.println( "Future Result --- >" + res.get());
        }



    }
}

package Java_Concepts.Multithreading;

import java.util.concurrent.*;

public class CompletableFuturee {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exe1 = new ThreadPoolExecutor(6, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() );
        for (int i = 0; i < 5; i++) {
            //CompletableFuture.runAsync(CompletableFuturee::m1,exe1);
        }

        for (int i = 0; i < 5; i++) {
           // CompletableFuture<Integer> res = CompletableFuture.supplyAsync(CompletableFuturee::m2,exe1);
           // System.out.println(res.get());
        }

        //thenApply
        CompletableFuture<Integer> res = CompletableFuture.supplyAsync(CompletableFuturee::m3,exe1).thenApply(n->Integer.parseInt(n));
        System.out.println(res.join());

        //thenAccept
        CompletableFuture.supplyAsync(CompletableFuturee::m3,exe1).thenAccept(n->System.out.print(n+"Raja Periyasami"+" --->"+Thread.currentThread().getName()));
        System.out.println();

        //thenrun
        CompletableFuture.supplyAsync(CompletableFuturee::m3,exe1).thenRun(()->{System.out.print("Running"+" --->"+Thread.currentThread().getName());});

    }

    public static void m1()
    {
        System.out.println(Thread.currentThread().getName());

    }

    public static Integer m2()
    {
        System.out.println(Thread.currentThread().getName() + "  -->  m2");
        return 10;
    }

    public static String m3()
    {
        System.out.println(Thread.currentThread().getName() + "  -->  m2");
        return "ChandraSekar";
    }


}

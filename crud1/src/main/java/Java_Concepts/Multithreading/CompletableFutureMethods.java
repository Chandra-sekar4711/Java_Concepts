package Java_Concepts.Multithreading;

import java.util.concurrent.*;

public class CompletableFutureMethods {

    public static void main(String[] args) {

        ExecutorService exe1 = new ThreadPoolExecutor(6, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() );
        CompletableFuture<String> resuilt = CompletableFuture.supplyAsync(()-> {
            System.out.println("1----------> "+Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "executing";},exe1).thenAcceptAsync((n)->{
            System.out.println("2----------> "+Thread.currentThread().getName());},exe1).thenApplyAsync(n-> {
            System.out.println("3----------> "+Thread.currentThread().getName());
            return "Happy New Year";
        },exe1);

        System.out.println("4-------->"+resuilt.join());

        System.out.print("===================================================================================================================");
        System.out.println();
        //ThenCompose
        CompletableFuture<String> ress = CompletableFuture.supplyAsync(CompletableFutureMethods::last,exe1);
        CompletableFuture<String> result = ress.thenCompose(n->{
            return CompletableFuture.supplyAsync(()-> n+"world",exe1);
        });
        System.out.println(result.join());

        //ThenCombine
        CompletableFuture<Integer> obj2 = CompletableFuture.supplyAsync(()->100);
        CompletableFuture<Integer> resu = CompletableFuture.supplyAsync(CompletableFutureMethods::sumasync).thenCombine(obj2,(n1,n2)->n1+n2);
        System.out.println(resu.join());


        //Exceptionally

        CompletableFuture<String> jj =
                CompletableFuture.supplyAsync(() -> {
                    if (false)
                        return "success";
                    else
                            throw new RuntimeException("exception da maplae");

                        })
                        .exceptionally(ex -> {
                            return "fallback value";
                        });

        System.out.println(jj.join());

        //thencomplete

        CompletableFuture<String> jj1 = CompletableFuture.supplyAsync(()->{ if (10==9) return "10" ; else throw new RuntimeException("Dai exception");}).handle((result1,ex)->{if (ex!=null)
        return "Error occured";
            else
                return result1;
        });

        System.out.println(jj1.join());




















    }

    private static Integer sumasync() {
        try{        Thread.sleep(3000);
        }catch (Exception w)
        {
            System.out.println("caughted");
        }
        return 100;
    }

    private static String last() {
        try{        Thread.sleep(2000);
        }catch (Exception w)
        {
            System.out.println("caughted");
        }
        return "Hello";
    }

    public CompletableFuture<String> m1()
    {
        return CompletableFuture.supplyAsync(()->"m1");
    }

    public CompletableFuture<String> m2()
    {
        return CompletableFuture.supplyAsync(()->"m2");
    }
}

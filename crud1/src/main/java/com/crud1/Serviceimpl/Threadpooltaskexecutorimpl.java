package com.crud1.Serviceimpl;

import com.crud1.Config.Threadpoolconfig;
import com.crud1.Service.Threadpooltaskexecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class Threadpooltaskexecutorimpl implements Threadpooltaskexecutor {

    @Autowired
    ThreadPoolTaskExecutor taskExecutor;

    @Async("taskExecutor")
    @Override
    public void sendmail() {

            System.out.println("Mail sent - " + Thread.currentThread().getName());
            throw new RuntimeException("Exception on Taskexecutor with Async");

    }


    @Override
    public CompletableFuture<Void> sendmailvia_runasync() {
       //RunAsync Always Return Void so exception are not caught we need exceptionally or try catch to handle the exception on asynchronous
        System.out.println("Sending mail - " + Thread.currentThread().getName());
        CompletableFuture<Void> res = CompletableFuture.runAsync(Threadpooltaskexecutorimpl::calculate,taskExecutor);
        System.out.println("finished");
        return res.exceptionally((e)->{  System.out.println("Caught exception: " + e.getMessage()); return null;});

    }

    public void sendmailvia_supplyasync() {
        //RunAsync Always Return Void so exception are not caught we need exceptionally or try catch to handle the exception on asynchronous
        System.out.println("Sending mail - " + Thread.currentThread().getName());
        CompletableFuture<String> res = CompletableFuture.supplyAsync(Threadpooltaskexecutorimpl::calculate1,taskExecutor);
        res.exceptionally((e)->{  System.out.println("Caught exception: " + e.getMessage()); return "Exception happened inside supplyasync";});
    }


    public static void calculate()
    {
        System.out.println("Mail sent - " + Thread.currentThread().getName());
        throw new RuntimeException("exception on Runasync");
    }


    public static String  calculate1()
    {
        return "Success";
    }



}

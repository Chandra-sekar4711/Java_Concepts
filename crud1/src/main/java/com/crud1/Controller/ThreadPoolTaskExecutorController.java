package com.crud1.Controller;

import com.crud1.Service.Threadpooltaskexecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadPoolTaskExecutorController{

    @Autowired
    Threadpooltaskexecutor executors;

    @PostMapping("Threadpooltaskexecutor")
    public void Threadpooltaskexecutor() throws InterruptedException {
        System.out.println("preparing to send mail Threadpooltaskexecutor ");
        for(int i=0;i<10;i++)
        {
            Thread.sleep(100);
        executors.sendmail();
        }
        System.out.println("Execution finished");
    }

    @PostMapping("/Completablerunasync")
    public void completeablerunasync()
    {
        for(int i=0;i<10;i++) {
            System.out.println("preparing to send mail Runasync ");
            executors.sendmailvia_runasync();
        }
        System.out.println("Execution finished");

    }
}

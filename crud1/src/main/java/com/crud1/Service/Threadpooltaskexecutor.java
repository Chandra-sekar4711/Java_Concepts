package com.crud1.Service;

import java.util.concurrent.CompletableFuture;

public interface Threadpooltaskexecutor {

    void sendmail();
    CompletableFuture<Void> sendmailvia_runasync();
}

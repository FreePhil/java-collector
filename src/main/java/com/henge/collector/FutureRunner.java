package com.henge.collector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Slf4j
@Component
public class FutureRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("This is a future runner that will be executed after the application starts.");

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            log.info("future1 launch");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("future1 finished");
            return "Hello";});
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            log.info("future2 launch");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("future2 finished");
            return "World";});

        CompletableFuture<String> future = CompletableFuture.allOf(future1, future2).thenApply(v -> future1.join() + " " + future2.join());
        log.info(future.join());
    }
}

package org.example.asynchronousProgramming.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


// Future.
public class F1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<List<Integer>> f1 = executorService.submit(() -> {
            System.out.println("Thread Name " + Thread.currentThread());
            //System.out.println(10/0);// It will give arithmetic exception. Future does not allow exception handling.
            return Arrays.asList(1, 2, 3, 4, 5);
        });
        List<Integer> list = f1.get();
        // Process cannot be stopped before the completion of get call.
        // Cannot be able to join the future like future1 + future2 + future3;
        System.out.println(list);
    }
}

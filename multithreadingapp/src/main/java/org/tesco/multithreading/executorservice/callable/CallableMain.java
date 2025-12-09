package org.tesco.multithreading.executorservice.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Thread thread  =new Thread(new SumTask());
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future result = executor.submit(new SumTask());
        System.out.println(result.get());
        executor.shutdown();
    }
}

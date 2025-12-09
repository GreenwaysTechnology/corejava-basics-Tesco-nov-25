package org.tesco.multithreading.executorservice.callable;

import java.util.concurrent.Callable;

public class SumTask implements Callable {
    @Override
    public Integer call() throws Exception {
        return 10 + 20;
    }
}

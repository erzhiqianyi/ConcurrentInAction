package me.caofeng.lock;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class SynchronizedDemo {
    public void method() {
        synchronized (this) {
            System.out.println("Method  start");
        }
    }
}

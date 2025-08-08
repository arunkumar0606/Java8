package Threads.DifferentWays.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mutitasker {
    public static void main(String[] args) {
        //Singlethreadexecutor = single thread in the pool
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        //NewFixedthreadpool = fixed number of threads in the pool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);

        //newcachedthreadpool = dynamic pool,but resuses threads when they are not needed
        ExecutorService  cachedThreadPool = Executors.newCachedThreadPool();
        Runnable task1 = () -> System.out.println("Task 1 Some task is running by " + Thread.currentThread().getName());
        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Task 2 is running by " + Thread.currentThread().getName() + " iteration: " + i);
            }
        };
        singleThreadExecutor.submit(task1);
        fixedThreadPool.submit(task2);
        cachedThreadPool.submit(task2);
    }
}

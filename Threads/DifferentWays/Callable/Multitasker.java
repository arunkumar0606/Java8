package Threads.DifferentWays.Callable;

import java.util.concurrent.*;

public class Multitasker {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Method 1: Using Callable with ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<String> task1 = () -> {
            System.out.println("Task 1 Some task is running by " + Thread.currentThread().getName());
            Thread.sleep(2000); // Simulating some work with sleep
            return "Task 1 completed";
        };

        Future<String> threadReturn = executorService.submit(task1);
        System.out.println("Thread return: " + threadReturn.get());
        executorService.shutdown();

        //Method 2: Using Callable with Future
        Callable<String> callableTask = () -> {
            Thread.sleep(1000);
            return "Result from Callable";
        };
        FutureTask<String> futureTask = new FutureTask<>(callableTask);

        Thread thread = new Thread(futureTask);
        thread.start();

        String result = futureTask.get();
        System.out.println("Result from FutureTask: " + result);


    }
}

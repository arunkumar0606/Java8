package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
 public static void main(String[] args) {
    ExecutorService exe=Executors.newFixedThreadPool(3);

    exe.submit(()->
    {
        Thread currentThread=Thread.currentThread();
        System.out.println("Hello " + currentThread.hashCode());
    });
    exe.submit(()->
    {
        Thread currentThread=Thread.currentThread();
        System.out.println("Welcome "+currentThread.hashCode());
    });
    exe.submit(()->
    {
        Thread currentThread=Thread.currentThread();
        System.out.println("to JAVA "+currentThread.hashCode());
    });

    exe.shutdown();

 }   
}

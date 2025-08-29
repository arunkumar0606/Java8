package Threads.DifferentWays.Lambda;

public class Multitasker {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Task 1 Some task is running by " + Thread.currentThread().getName());

        Runnable task2 = ()->{
            for(int i = 0; i < 5; i++) {
                System.out.println("Task 2 is running by " + Thread.currentThread().getName() + " iteration: " + i);
            }
        };


        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}

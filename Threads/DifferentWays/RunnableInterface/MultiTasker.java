package Threads.DifferentWays.RunnableInterface;

public class MultiTasker implements Runnable {
    @Override
    public void run() {
        System.out.println("Some task is running by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultiTasker task = new MultiTasker();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }
}

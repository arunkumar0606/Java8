package Threads.Creation;

public class LambdaThread {
    public static void main(String[] args) {
        Runnable task=()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i + Thread.currentThread().hashCode());
                try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        };

        Thread t1=new Thread(task);
        t1.start();
    }
}

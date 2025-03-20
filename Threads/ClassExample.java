package Threads;

public class ClassExample extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }

    public static void main(String[] args) {
        Thread t1=new ClassExample();
        t1.start();
    }
}

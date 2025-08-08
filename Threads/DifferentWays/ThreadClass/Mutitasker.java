package Threads.DifferentWays.ThreadClass;

public class Mutitasker extends Thread{
    @Override
    public void run() {
        System.out.println("Some task is running by "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Mutitasker thread1= new Mutitasker();
        Mutitasker thread2= new Mutitasker();
        thread1.start();
        thread2.start();
    }

}

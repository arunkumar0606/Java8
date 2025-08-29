package Threads.Creation;

public class InterfaceEx implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new InterfaceEx());
        t1.start();
    }
    
    
}

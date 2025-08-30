package Threads.Practice.WaitAndNotify;

public class AlternatePrint {
    public static void main(String[] args) {
        PrintNumbers pn = new PrintNumbers();
        Thread t1 = new Thread(() -> {
            try {
                pn.printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                pn.printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }
}
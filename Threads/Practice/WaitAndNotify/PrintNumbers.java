package Threads.Practice.WaitAndNotify;

class PrintNumbers {
    private int num = 1;
    private final int limit = 10;

    public synchronized void printOdd() throws InterruptedException {
        while (num <= limit) {
            if (num % 2 == 0) {
                wait();
            } else {
                System.out.println("Odd: " + num);
                num++;
                notify();
            }
        }
    }

    public synchronized void printEven() throws InterruptedException {
        while (num <= limit) {
            if (num % 2 != 0) {
                wait();
            } else {
                System.out.println("Even: " + num);
                num++;
                notify();
            }
        }
    }
}
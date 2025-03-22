package Threads.ThreadLocal;

import java.util.HashSet;

public class ThrdLocal {
    public static ThreadLocal<Integer> value=ThreadLocal.withInitial(()->2);
    public static void main(String[] args) {
        Runnable task = ()->{
            value.set(value.get()*2);
            System.out.println("Value :"+value.get());
        };
        Thread t1=new Thread(task);
        t1.start();
        Thread t2=new Thread(task);
        t2.start();
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(3));
 }

}

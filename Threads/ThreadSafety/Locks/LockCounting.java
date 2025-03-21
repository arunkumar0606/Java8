package Threads.ThreadSafety.Locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockCounting {
        private int count = 0;

        private final ReentrantLock lock =new ReentrantLock();
    
        public synchronized void increment() {
              // Thread-safe method
            lock.lock();

            try{
                 count++;
            }finally{
                lock.unlock();
            }
        }
    
        public int getCount() {
            return count;
        }
    }
    

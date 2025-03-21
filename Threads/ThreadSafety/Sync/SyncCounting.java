package Threads.ThreadSafety.Sync;
public class SyncCounting {
        private int count = 0;
    
        public synchronized void increment() {
             // Thread-safe method
            count++;
        }
    
        public synchronized int getCount() {
            return count;
        }
    }
    

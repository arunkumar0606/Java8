package Threads.ThreadSafety.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

        private  AtomicInteger count=new AtomicInteger();  // Thread-safe integer
    
        public  void increment() {
        
             count.incrementAndGet();
           
        }
    
        public int getCount() {
            return count.get();
        }
    }
    

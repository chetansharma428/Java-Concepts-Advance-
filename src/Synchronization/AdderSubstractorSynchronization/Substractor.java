package Synchronization.AdderSubstractorSynchronization;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable{
    Count count;
    Lock lock;
    Substractor(Count count, Lock lock) {
        this.lock = lock;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
//            This Make the Code Thread safe, Only 1 thread can enter the Critical Section at a time
            lock.lock();
            count.value -= i;
            lock.unlock();
        }
    }
}

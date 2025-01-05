package Synchronization.AdderSubstractorSynchronization;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count count;
    Lock lock;
    Adder(Count count, Lock lock) {
        this.lock = lock;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            lock.lock();
            count.value += i;
            lock.unlock();
        }
    }
}

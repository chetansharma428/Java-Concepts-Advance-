package Synchronization.AdderSubstractorLock;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable{
    Count count;
    Substractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            synchronized(count){
                count.value -= i;
            }
        }
    }
}

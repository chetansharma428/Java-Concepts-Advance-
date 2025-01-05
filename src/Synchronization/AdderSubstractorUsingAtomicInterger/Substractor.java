package Synchronization.AdderSubstractorUsingAtomicInterger;

public class Substractor implements Runnable{
    Count count;

    Substractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
//            count.value -= i;
            count.count.addAndGet(-i);
        }
    }
}

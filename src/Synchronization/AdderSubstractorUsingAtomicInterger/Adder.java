package Synchronization.AdderSubstractorUsingAtomicInterger;

public class Adder implements Runnable {
    private Count count;

    Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
//            count.value += i;
//            count.adder(i);
              count.count.addAndGet(i);
        }
    }
}

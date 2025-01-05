package Synchronization.AdderSubstractorLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Substractor substractor = new Substractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(substractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //As the Result will always be 0 because we have used Synchronized Method to prevent multiple thread to enter
        //into critical section, this way there will be no Race condition and the results will be same
        System.out.println(count.value);
    }
}

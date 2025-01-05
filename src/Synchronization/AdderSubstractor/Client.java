package Synchronization.AdderSubstractor;

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

        //As this will give an Unexpected result because the threads are not Synchronized
        //and both of them are accessing Critical Section at the same time which leads to
        //unexpected result and not Synchronizable.
        System.out.println(count.value);
    }
}

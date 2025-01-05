package Synchronization.AdderSubstractorUsingAtomicInterger;

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

       // we have use AtomicInteger Which is thread safe in Count variable which make it thread safe
        // only one thread can add or substract at the given time
        System.out.println(count.count.get());
    }
}

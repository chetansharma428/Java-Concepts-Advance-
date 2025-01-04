package Concurrency2.PrintNumber1to100;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //Here Exector Framework will manage and handles which thread will be assigned to get the job done.
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        /*
            * Reuses a fixed number of threads for all submitted tasks.
            * If a thread is idle, it will be reused for a new task.
            * If all threads are busy, tasks are queued until a thread becomes available.
        */
        for (int i = 1; i <=100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }
        executorService.shutdown(); //An ExecutorService should be shut down once it is no longer needed to free up system resources
    }
}
/*
    Creating threads, destroying threads, and then creating them again can be expensive.
    A thread pool mitigates the cost, by keeping a set of threads around, in a pool, for current and future work.
    Threads, once they complete one task, can then be reassigned to another task, without the expense of destroying
    that thread and creating a new one.
 */

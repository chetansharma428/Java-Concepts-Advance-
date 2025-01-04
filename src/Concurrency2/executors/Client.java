package Concurrency2.executors;

public class Client {
    public static void main(String[] args) {
        //As we can see for Every number a new Thread has been created which lead to wastage of threads and Inefficiency
        for(int i=1; i<=100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
}

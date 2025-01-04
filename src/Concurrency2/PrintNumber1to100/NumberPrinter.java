package Concurrency2.PrintNumber1to100;

public class NumberPrinter implements Runnable{
    private int numberToPrint;

    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
     System.out.println(numberToPrint + " is printed From Thread:" + Thread.currentThread().getName());
    }

}

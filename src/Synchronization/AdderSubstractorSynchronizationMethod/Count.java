package Synchronization.AdderSubstractorSynchronizationMethod;

public class Count {
   private int value = 0;

   public synchronized void adder(int i){
       value += i;
   }
   public synchronized int getValue(){
       return value;
   }
}

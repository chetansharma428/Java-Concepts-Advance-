package FunctionInterface.LambdasAndStreams;

@FunctionalInterface
public interface IFunctional{
    //Only Single Abstract Method
    void fun();

    //We can have default method inside a functional Interface, it doesn't violate the FI principles
    default void fun1(){
        System.out.println("It is a Default functional Method");
    }
}

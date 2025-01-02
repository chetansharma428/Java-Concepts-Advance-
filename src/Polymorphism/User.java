package Polymorphism;

public class User {
    public void fun(String name){
        System.out.println("Hello, I am " + name);
    }

    //method overloading
    public void doSomething(String name){
        System.out.println("Hello, I am " + name);
    }
    public void doSomething(String name, int age){
        System.out.println("Hello, My name is " + name + " and my age is  " + age);
    }
}

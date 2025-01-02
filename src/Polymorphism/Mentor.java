package Polymorphism;

public class Mentor extends User{
    @Override
    public void fun(String name) {
        System.out.println("Yo, I am " + name);
    }
}

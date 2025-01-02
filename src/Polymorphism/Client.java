package Polymorphism;

public class Client {
    public static void main(String[] args) {

        //Method Overridding : changing the parents implementation at the child level
        User user = new User();
        user.fun("chetan");
        user = new TA();
        user.fun("aman");
        user = new Mentor();
        user.fun("Riya");

        //Method Overloading : Same name of the method but with different parameters
        user = new User();
        user.doSomething("Chetan");
        user.doSomething("Riya", 26);
    }
}

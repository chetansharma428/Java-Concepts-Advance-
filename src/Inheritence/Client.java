package Inheritence;

public class Client {
    public static void main(String[] args) {
        User user = new Student();
        user.name = "Chetan";
        user.age = 27;
        System.out.println("DEBUG");
    }
}

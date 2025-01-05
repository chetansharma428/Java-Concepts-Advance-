package FunctionInterface.LambdasAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

        //Lambda Expression
        IFunctional functional = () -> System.out.println("Printing From lambda expression");
        functional.fun();
        functional.fun1();

        //Adding Two Numbers Traditional Way
//        TestClass testClass = new TestClass() {
//            @Override
//            public int operate(int a, int b) {
//                return a + b;
//            }
//        };
//       System.out.println(testClass.operate(26,54));
//
        //Adding Two Numbers using lambda Expression
//        TestClass testClass = (a,b) -> a + b;
//        System.out.println(testClass.operate(70,54));

        //Even Number Check Traditional Way
//        TestClass testClass = new TestClass() {
//            @Override
//            public boolean EvenNumberCheck(int number) {
//                return number % 2 == 0;
//            }
//        };
//        System.out.println(testClass.EvenNumberCheck(6));

        //Even Number Check Using lambda Expression
        TestClass testClass = (number) -> number % 2 == 0;
        System.out.println(testClass.EvenNumberCheck(19));


        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");

        List<String> fruitsStream = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(fruitsStream);
    }
}

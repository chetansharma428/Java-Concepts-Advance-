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

/*
        ADVANTAGES OF STREAMS:
        
        Code Reduction: Streams allow you to perform complex operations on data elements in a more concise and compact manner compared to traditional loops. This leads to fewer lines of code and improved code maintainability.

        Parallelism: Streams can be easily converted to parallel streams, allowing you to take advantage of multi-core processors and perform operations concurrently. This can lead to improved performance for certain types of data processing tasks.

        Separation of Concerns: With traditional loops, you often mix the concerns of iterating over elements, filtering, mapping, and aggregation within a single loop. Streams encourage a separation of concerns by providing distinct operations that can be chained together in a more modular way.

        Lazy Evaluation: Streams introduce lazy evaluation, which means that operations are only performed when the results are actually needed. This can lead to improved performance by avoiding unnecessary computations.

        Functional Programming: Streams embrace functional programming concepts by providing operations that transform data in a functional and immutable manner. This makes it easier to reason about the behavior of your code and reduces the potential for side effects.

        Data Abstraction: Streams abstract away the underlying data source, allowing you to work with different data sources (collections, arrays, I/O channels) in a consistent way. This makes your code more flexible and reusable.
 */

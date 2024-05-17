package my.learn.designpatterns;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println("c1 = " + s);
        Consumer<String> c2 = s -> System.out.println("c2 = " + s);

        c1.accept("Hello");
        c2.accept("World");

        Consumer<String> c3 = c1.andThen(null);

        c3.accept("It is hot!");


    }
}

package my.learn.streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> printer = System.out::println;
        Stream.of(3, 5, 1, 4, 9, 5).forEach(printer);
    }
}

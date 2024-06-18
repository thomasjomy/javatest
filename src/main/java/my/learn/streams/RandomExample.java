package my.learn.streams;

import java.util.stream.Stream;

public class RandomExample {
    public static void main(String[] args) {
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }
}

package my.learn.streams;

import java.util.Random;
import java.util.stream.Stream;

public class Iterator {

    private static Random random = new Random();

    public static void main(String[] args) {
        Stream.iterate(1, i -> i + 1)
                .limit(random.nextInt(100))
                .forEach(System.out::print);
    }
}

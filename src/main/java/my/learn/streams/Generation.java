package my.learn.streams;

import my.learn.domain.Box;

import java.util.Random;
import java.util.stream.Stream;

public class Generation {
    private static Random random = new Random();

    public static void main(String[] args) {
        generateBoxes();
    }

    private static void generateBoxes(){
        System.out.println("Counter before generating: " + Box.getCounter());
        Stream<Box> stream = Stream.generate(() -> new Box()).limit(random.nextInt(1000));
        System.out.println("Counter after generating: " + Box.getCounter());

        Box[] boxes = stream.toArray(Box[]::new);
        System.out.println("Real box count: " + boxes.length);
    }
}

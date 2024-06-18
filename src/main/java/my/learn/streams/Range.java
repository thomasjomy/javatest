package my.learn.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Range {

    public static void main(String[] args) {
        range();
        rangeClosed();
    }

    private static void range() {
        List<Integer> ints = IntStream.range(10, 15)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(ints);
    }

    private static void rangeClosed(){
        List<Long> longs = LongStream.rangeClosed(10, 15)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(longs);
    }

}

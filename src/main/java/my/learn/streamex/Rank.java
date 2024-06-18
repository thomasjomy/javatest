package my.learn.streamex;

import one.util.streamex.StreamEx;

import java.util.stream.IntStream;

public class Rank {

    public static void main(String[] args) {
        rankByNaturalOrder("test", "apple",  "lemon");
    }

    private static void rankByNaturalOrder(String... words){
        StreamEx.of(words)
                .sorted()
                .zipWith(IntStream.range(0, words.length).boxed())
                //.join(". ")
                .forEach(System.out::println);
    }
}

package my.learn.vavr;

import io.vavr.collection.List;

public class NaturelOrdering {
    public static void main(String[] args) {
        String[] words = {"test", "lemon", "mango", "banana", "grape",  "avacado", "passion fruit", "dates", "kiwi"};

        List.of(words)
                .sorted()
                .zipWithIndex()
                .map(t -> t._2 + ". " + t._1)
                .forEach(System.out::println);
    }
}

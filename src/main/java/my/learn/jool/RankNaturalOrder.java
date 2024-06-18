package my.learn.jool;

import org.jooq.lambda.Seq;

public class RankNaturalOrder {
    public static void main(String[] args) {

        String[] words = {"test", "lemon", "mango", "banana", "grape",  "avacado", "passion fruit", "dates", "kiwi"};

        Seq.of(words)
                .sorted()
                .zipWithIndex()
                .map(t -> t.v2 + ". " + t.v1)
                .forEach(System.out::println);
    }
}

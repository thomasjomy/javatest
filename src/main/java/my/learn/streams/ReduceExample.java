package my.learn.streams;

import my.learn.testdata.WordStream;

public class ReduceExample {
    public static void main(String[] args) {
        WordStream.getProgrammingLanguages().stream().map(s -> s.length())
                .reduce((x , y) -> x + y)
                .ifPresent(System.out::println);
    }
}

package my.learn.vavr;

import io.vavr.control.Try;

public class TryExample {
    public static void main(String[] args) {
        Try<Integer> result = Try.of(() -> 1 / 0);

        if(result.isFailure()){
            System.out.println("Try failed " + Try.failure(result.getCause()));
        }

        int fallbackValue = result.getOrElse(-1);

        System.out.println("Try failed but returning fallback value " +  fallbackValue);
    }
}

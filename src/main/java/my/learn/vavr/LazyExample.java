package my.learn.vavr;

import io.vavr.Lazy;

public class LazyExample {

    public static void main(String[] args) {
        Lazy<Double> lazy = Lazy.of(Math::random);
        System.out.println("Check is evaluated ?  " + lazy.isEvaluated());

        if (!lazy.isEvaluated()) {
            double fetchRandomValue = lazy.get();
            System.out.println("Fetching Random Value " + fetchRandomValue);
        }

        System.out.println("Check again is lazy evaluated after fetching random value ? :  " + lazy.isEvaluated());

        if (lazy.isEvaluated()) {
            double fetchRandomValue = lazy.get();
            System.out.println("Fetching Random Value  again, it should be the same:  " + fetchRandomValue);
        }

        double fetchRandomValue = lazy.get();
        System.out.println("Fetch again, it should be the same: " + fetchRandomValue);


    }
}

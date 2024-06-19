package my.learn.vavr;

import io.vavr.Tuple;
import io.vavr.Tuple2;

public class TupleExample {
    public static void main(String[] args) {
        Tuple2<String, String> state = Tuple.of("Karnataka", "Bangalore");

        System.out.println("State is : " + state._1);
        System.out.println("Capital is : " + state._2);
    }
}

package my.learn.fucntion;

import io.vavr.Function5;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample2 {

    public static void main(String[] args) {
        Function<Integer, Integer> square = (num) -> num * num;
        int result = square.apply(2);
        System.out.println("Square of 2 is " +  result);

        BiFunction<Integer, Integer, Integer> sum  = (num1, num2) -> num1 + num2;
        int sumResult = sum.apply(5, 7);
        System.out.println(sumResult);

        Function5<String, String, String, String, String, String> concat = (a, b, c, d, e) -> a + b + c + d + e;
        String resultString = concat.apply("Hello ", "People", "! ", "Learn ", "Vavr");
        System.out.println(resultString);
    }

}

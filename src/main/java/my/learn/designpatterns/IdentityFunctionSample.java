package my.learn.designpatterns;

import java.util.function.Function;

public class IdentityFunctionSample {
    public static void main(String[] args) {
        Function<String, String> identity = Function.identity();

        System.out.println(identity.apply("Hello"));
    }
}


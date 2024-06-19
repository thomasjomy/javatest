package my.learn.fucntion;

import io.vavr.Function1;
import io.vavr.Function4;
import my.learn.domain.User;

public class FunctionExamples {
    private Function1<String, String> toUpperCase =  String::toUpperCase;

    private Function1<User, String>  lastName = User::getLastName;

    private Function1<User, String> lastNameUpperCase = lastName.andThen(toUpperCase);

    private Function4<Integer, Integer, Integer, Integer, Integer> sum = (a, b, c, d) -> a + b + c + d;

    public static void main(String[] args) {
        FunctionExamples fex = new FunctionExamples();
        int result = fex.sum.apply(1, 2, 3, 4);
        System.out.println(result);
    }


}

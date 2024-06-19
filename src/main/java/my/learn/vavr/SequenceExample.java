package my.learn.vavr;

import io.vavr.collection.List;

public class SequenceExample {
    public static void main(String[] args) {
        String retString = joinStr("Armenia", "Yerevan", "Java");
        System.out.println(retString);
    }

    public static String joinStr(String... words) {
        return List.of(words)
                .intersperse("@")
                .fold("#### ", String::concat);
    }
}

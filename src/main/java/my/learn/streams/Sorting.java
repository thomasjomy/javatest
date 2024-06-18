package my.learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "string");
        List<String> sortedStrings1 = strings.stream().sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toUnmodifiableList());

        List<String> sortedStrings2 = strings.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(sortedStrings1);
        System.out.println(sortedStrings2);
    }
}

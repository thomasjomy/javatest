package my.learn.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {
    private Long id;
    private final String firstName;
    private final String lastName;
    private final int age;
}

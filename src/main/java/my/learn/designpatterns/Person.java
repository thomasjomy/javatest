package my.learn.designpatterns;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private int age;


}

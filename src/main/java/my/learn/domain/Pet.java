package my.learn.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Pet {
    private final String name;
    private final int age;
    private final PetType type;
}

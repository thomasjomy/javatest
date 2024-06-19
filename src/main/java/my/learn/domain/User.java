package my.learn.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class User {
    private  UUID id;
    private  String userName;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String password;
    private  Address address;
}

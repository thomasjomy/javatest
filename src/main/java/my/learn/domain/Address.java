package my.learn.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class Address {
    private  int streetNumber;
    private  String streetName;
    private  String zipCode;
    private  String city;
    private  String country;
}

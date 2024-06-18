package my.learn.testdata;

import my.learn.domain.Permission;
import my.learn.domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonData {
    private static List<Person> persons;

    public static List<Person> get() {
        return persons;
    }


    static {
        persons = Arrays.asList(
                new Person("Max", "Dimon", 18),
                new Person("Peter", "Pan", 23),
                new Person("Pamela", "Andreson", 23),
                new Person("David", "Cameroon", 12),
                new Person("Jomy", "Thomas", 20),
                new Person("Adrian", "Gonsalves", 30),
                new Person("Ravi", "Kumar", 40),
                new Person("Jamie", "Dimon", 20),
                new Person("Vivian", "Slater", 30),
                new Person("Anand", "Raghavan", 40)
        );

    }
}

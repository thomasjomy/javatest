package my.learn.streamex;

import my.learn.domain.Permission;
import my.learn.domain.Person;
import one.util.streamex.StreamEx;

import java.util.ArrayList;
import java.util.List;

public class DistinctByAttribute {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jomy", "Thomas", 20));
        people.add(new Person("Adrian", "Gonsalves", 30));
        people.add(new Person("Ravi", "Kumar", 40));
        people.add(new Person("Jamie", "Dimon", 20));
        people.add(new Person("Vivian", "Slater", 30));
        people.add(new Person("Anand", "Raghavan", 40));
        people.add(new Person("Jomy", "Thomas", 20));
        people.add(new Person("Anand", "Berde", 40));

        StreamEx.of(people)
                .distinct(Person::getFirstName)
                .toList()
                .forEach(System.out::println);

        System.out.println("--------------------------------------");
        people.stream().distinct().forEach(System.out::println);
    }
}

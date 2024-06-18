package my.learn.vavr;

import my.learn.domain.Person;
import one.util.streamex.StreamEx;

import java.util.ArrayList;
import java.util.List;

public class DistinctPeople {
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
        people.add(new Person("Kane", "Thomas", 40));

        List<Person> distinctPeople = io.vavr.collection.List.ofAll(people)
                .distinctBy(Person::getFirstName)
                .distinctBy(Person::getLastName)
                .toJavaList();

        distinctPeople.forEach(System.out::println);
    }
}

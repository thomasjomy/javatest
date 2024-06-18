package my.learn.streamex;

import my.learn.domain.Permission;
import my.learn.domain.Person;
import one.util.streamex.EntryStream;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Map<Permission, List<Person>> permissions = new HashMap<>();
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jomy", "Thomas", 20));
        persons.add(new Person("Adrian", "Gonsalves", 30));
        persons.add(new Person("Ravi", "Kumar", 40));
        permissions.put(Permission.READ, persons);

        List<Person> persons2 = new ArrayList<>();
        persons2.add(new Person("Jamie", "Dimon", 20));
        persons2.add(new Person("Vivian", "Slater", 30));
        persons2.add(new Person("Anand", "Raghavan", 40));
        persons2.add(new Person("Jomy", "Thomas", 20));

        permissions.put(Permission.WRITE, persons2);

        Map<Person, Set<Permission>> personRoleMap = groupByPerson(permissions);
        System.out.println(personRoleMap);



    }

    private static Map<Person, Set<Permission>> groupByPerson(Map<Permission, List<Person>> permissions){
        return EntryStream.of(permissions)
                .flatMapValues(List::stream)
                .invert()
                .groupingTo(HashSet::new);
    }
}

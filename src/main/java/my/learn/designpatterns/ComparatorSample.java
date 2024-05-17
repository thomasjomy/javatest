package my.learn.designpatterns;

import java.util.Comparator;

public class ComparatorSample {
    public static void main(String[] args) {
        Person mary = Person.builder()
                .firstName("Mary")
                .lastName("Alvarado")
                .age(28)
                .build();

        Person john = Person.builder()
                .firstName("John")
                .lastName("Smith")
                .age(22)
                .build();

        Person james = Person.builder()
                .firstName("James")
                .lastName("Verges")
                .age(32)
                .build();

        Person linda = Person.builder()
                .firstName("Linda")
                .lastName("Thomas")
                .age(26)
                .build();

        Person jomy = Person.builder()
                .firstName("Jomy")
                .lastName("Thomas")
                .age(26)
                .build();

        Comparator<Person> firstNameComparator = createFirstNameComparator();


        System.out.println("Linda > John : " + (firstNameComparator.compare(linda, james) > 0) );
        System.out.println("James > Mary : " + (firstNameComparator.compare(james, mary) > 0));

        Comparator<Person> lastNameComparator = Comparator.comparing(p -> p.getLastName());
        Comparator<Person> ageComparator = Comparator.comparing(p -> p.getAge());
        Comparator<Person> nameComparator = lastNameComparator.thenComparing(firstNameComparator);

        System.out.println("Linda("+ linda.getAge() + ") is Older than John(" + john.getAge() +") : " + (ageComparator.compare(linda, john) > 0));
        System.out.println("Linda("+ linda.getAge() + ") is Older than James(" + james.getAge() +") : " + (ageComparator.compare(linda, james) > 0));
    }

    private static Comparator<Person> createFirstNameComparator() {
        Comparator<Person> firstNameComparator = (p1, p2) -> {
            String firstName1 = p1.getFirstName();
            String firstName2 = p2.getFirstName();
            return firstName1.compareTo(firstName2);
        };

        return firstNameComparator;
    }
}

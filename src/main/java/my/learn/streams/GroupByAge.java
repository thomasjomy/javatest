package my.learn.streams;

import my.learn.domain.Person;
import my.learn.testdata.PersonData;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAge {
    public static void main(String[] args) {
        List<Person> persons = PersonData.get();
        Map<Integer, List<Person>> personsByAge = persons.stream()
                .collect(Collectors.groupingBy(p -> p.getAge()));

        System.out.println(personsByAge);

        IntSummaryStatistics ageSummary = persons.stream()
                .collect(Collectors.summarizingInt(p -> p.getAge()));

        System.out.println(ageSummary);

        Double averageAge = persons.stream().collect(Collectors.averagingInt(p -> p.getAge()));
        System.out.println(averageAge);

    }
}

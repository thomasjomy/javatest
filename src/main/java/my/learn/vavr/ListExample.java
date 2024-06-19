package my.learn.vavr;

import io.vavr.collection.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Integer> newList = intList.append(4);
        System.out.println(newList);

        List<Integer> newIntList = intList.tail().prepend(1);
        System.out.println(newIntList);

        int sum = List.of(1, 2, 3).sum().intValue();
        System.out.println("sum : " + sum);
    }
}

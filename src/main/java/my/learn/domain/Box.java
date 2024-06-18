package my.learn.domain;

public class Box {
    private static int counter;

    public Box() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}

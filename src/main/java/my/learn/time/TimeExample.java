package my.learn.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TimeExample {
    public static void main(String[] args) {
        System.out.println("Instant.now() : " + Instant.now());
        System.out.println("LocalDate.now() : " + LocalDate.now());
        System.out.println("LocalDateTime.now() : " + LocalDateTime.now());
        System.out.println("ZonedDateTime.now() : " + ZonedDateTime.now());
    }
}

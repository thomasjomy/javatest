package my.learn.optional;

import my.learn.domain.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        Optional<User> user =  repo.findOneOptional("1");
    }
}

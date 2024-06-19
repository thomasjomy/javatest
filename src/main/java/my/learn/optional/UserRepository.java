package my.learn.optional;

import my.learn.domain.Address;
import my.learn.domain.User;

import java.util.Optional;

public class UserRepository {
    public Optional<User> findOneOptional(String id) {
        return Optional.of(createUser());
    }

    private User createUser() {
        return User.builder()
                .userName("test")
                .email("test@gmai.com")
                .firstName("Test")
                .lastName("Test")
                .build();
    }
}

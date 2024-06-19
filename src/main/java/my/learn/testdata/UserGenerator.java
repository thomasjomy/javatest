package my.learn.testdata;

import io.vavr.collection.List;
import my.learn.domain.User;


public class UserGenerator {

    public static List<User> generateUserList(int count){
        return List.range(0, count).map(val -> generateUser(val));
    }

    public static User generateUser(int index) {
        return User.builder()
                .userName("userName" + index)
                .firstName("firstName" + index)
                .lastName("lastName" + index)
                .email("userName" + index + "@saagie.com")
                .password("P@Ssw()rdUser" + index)
                .address(AddressGenerator.generateAddress(index))
                .build();
    }
}

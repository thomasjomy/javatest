package my.learn.vavr;

import io.vavr.Tuple2;
import io.vavr.collection.List;
import io.vavr.collection.Map;
import my.learn.domain.User;
import my.learn.testdata.UserGenerator;


public class ToMapExample {
    public static void main(String[] args) {
        List<User> userList = UserGenerator.generateUserList(10);
        Map<String, User> usersByName = userList.toMap(user -> new Tuple2<>(user.getUserName(), user));
        System.out.println(usersByName);
    }
}

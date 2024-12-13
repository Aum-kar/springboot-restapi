package example.rest.repository;

import example.rest.model.User;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Getter
@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();


    public UserRepository() {
        users.add(new User(1, "Omkar", "Patil", "Sangli", List.of("Java", "MySQL")));
        users.add(new User(2, "Sourabh", "Kothale", "Sangli", List.of("Python", "Cyber Security")));
        users.add(new User(3, "Shubham", "Patil", "Kasbe Digraj", List.of("MySQL", "Javascript")));
    }

    public void save(User new_user) {
        users.add(new_user);
    }
}

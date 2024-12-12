package example.rest.service;

import example.rest.model.User;
import example.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> getAllUser() {
        return repository.getUsers();
    }

    public void addUser(User new_user) {
        repository.save(new_user);
    }

}

package example.rest.controller;

import example.rest.model.User;
import example.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    UserService service;

    @GetMapping("all_users")
    public List<User> usersEndpoint() {
        System.out.println("Call on /all_users endpoint");
        return service.getAllUser();
    }

    @GetMapping("add_user")
    public void addUser(User new_user) {
        service.addUser(new_user);
    }
}

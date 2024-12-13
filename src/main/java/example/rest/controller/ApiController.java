package example.rest.controller;

import example.rest.model.User;
import example.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    UserService service;

    @GetMapping("all_users")
    public List<User> usersEndpoint() {
        return service.getAllUser();
    }

    @GetMapping("user/{userId}")
    public User userEndPoint(@PathVariable("userId") int uid) {
        return service.getUser(uid);
    }

    @PostMapping("add_user")
    public void addUser(@RequestParam("uid") int uid,
                        @RequestParam("first_name") String firstName,
                        @RequestParam("last_name") String lastName,
                        @RequestParam("address") String address,
                        @RequestParam("skills") List<String> skills) {

        service.addUser(new User(uid, firstName, lastName, address, skills));
    }
}

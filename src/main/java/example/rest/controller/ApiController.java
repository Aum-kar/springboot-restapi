package example.rest.controller;

import example.rest.model.User;
import example.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    UserService service;

    @GetMapping("allUsers")
    public List<User> usersEndpoint() {
        return service.getAllUser();
    }
}

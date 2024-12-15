package example.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping(path={"", "user"})
    public String rootEndpoint() {
        return "index";
    }

}

package example.rest.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int uid;
    private String firstName;
    private String lastName;
    private String address;
    private List<String> skills;
}

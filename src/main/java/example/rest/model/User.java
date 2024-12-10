package example.rest.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private int uid;
    private String firstName;
    private String lastName;
    private String address;
    private List<String> skills;
}

package example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller("/users")
public class UserController {

    private List<User> users = new ArrayList<>();

    @Get(produces = MediaType.APPLICATION_JSON)
    public List<User> getAllUsers() {
        User user = new User("123","Dangelo","dfit@gmail.com");
        users.add(user);
        return users;
    }

    @Post(consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public User createUser(@Body User user) {
        users.add(user);
        return user;
    }
}

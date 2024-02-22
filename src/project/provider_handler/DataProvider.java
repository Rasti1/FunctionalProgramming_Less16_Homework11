package project.provider_handler;

import project.entity.User;

import java.util.Arrays;
import java.util.List;

public class DataProvider {
    public List<User> getData(){

        return Arrays.asList(

                new User("Veronika", "(+380)67-677-12-45"),
                new User("Alice", "(+380)96-236-12-65"),
                new User("Lucy", "(+380)97-295-34-88"),
                new User("Leon", "(+380)63-784-89-13"),
                new User("David", "(+380)50-981-55-34")

        );
    }
}

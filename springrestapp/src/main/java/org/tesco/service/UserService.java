package org.tesco.service;

import org.springframework.stereotype.Service;
import org.tesco.model.User;

import java.util.List;

@Service
public class UserService {

    public List<User> findAllUsers() {
        return List.of(
                new User(1, "Subramanian"),
                new User(2, "Murugan")
        );
    }
}

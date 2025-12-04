package com.irfan.backend_training.service;

import com.irfan.backend_training.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public User registerUser(User user) {
        users.add(user);
        return user;
    }
}

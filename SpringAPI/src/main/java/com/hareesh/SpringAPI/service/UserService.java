package com.hareesh.SpringAPI.service;

import com.hareesh.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"Hareesh", 22, "hareesh@mail.com");
        User user2 = new User(2,"Rajendran", 57, "rajendran@mail.com");
        User user3 = new User(3,"Brinda", 23, "brinda@mail.com");
        User user4 = new User(4,"Vipin", 23, "vipin@mail.com");
        User user5 = new User(5,"Srini", 22, "srini@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
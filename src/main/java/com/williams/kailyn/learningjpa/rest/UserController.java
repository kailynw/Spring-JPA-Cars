package com.williams.kailyn.learningjpa.rest;

import com.williams.kailyn.learningjpa.entity.User;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController {

    @RequestMapping(path="/users", method= RequestMethod.GET)
    public List<User> getAllUsers(){
        List<User> userList= new ArrayList<>();

        userList.add(new User("James Bond", "goodman"));
        userList.add(new User("Charlie Bond", "goodman"));
        userList.add(new User("Tammmy Bond", "goodman"));
        userList.add(new User("Timmy Bond", "goodman"));

        return userList;

    }

}

package com.merhele02.developiaTask1.webApi.controller;

import com.merhele02.developiaTask1.business.abstracts.UserService;
import com.merhele02.developiaTask1.business.authenticate.Authentication;
import com.merhele02.developiaTask1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getall")
    public List<User> getAllUsers(){
        if (Authentication.isAuthenticated){
            return userService.getAll();
        }
        return null;
    }

    @PostMapping("/add")
    public User add(@RequestBody User user){
        if (Authentication.isAuthenticated){
            return userService.add(user);
        }
        return null;
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        if (Authentication.isAuthenticated){
            this.userService.delete(id);}
        return;
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Integer id,@RequestBody User user){
        if (Authentication.isAuthenticated) {
            return userService.editUser(id,user);
        }
        return null;
    }
}

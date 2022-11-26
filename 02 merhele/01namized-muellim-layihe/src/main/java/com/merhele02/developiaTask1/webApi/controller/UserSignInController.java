package com.merhele02.developiaTask1.webApi.controller;

import com.merhele02.developiaTask1.business.abstracts.UserService;
import com.merhele02.developiaTask1.business.authenticate.Authentication;
import com.merhele02.developiaTask1.core.entity.UserSignIn;
import com.merhele02.developiaTask1.core.results.Result;
import com.merhele02.developiaTask1.entities.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/app")

public class UserSignInController {
    private final UserService userService;

    public UserSignInController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signin")
    public RedirectView signIn(@RequestBody UserSignIn userSignIn) {

        List<User> users = userService.getAll();

        for (User u : users) {
            if (u.getUsername().equals(userSignIn.getUsername()) && u.getPassword().equals(userSignIn.getPassword())) {
                Authentication.isAuthenticated = true;
                return new RedirectView("/api/user");
            }
        }
        return new RedirectView("/signin/signIn");
    }
}

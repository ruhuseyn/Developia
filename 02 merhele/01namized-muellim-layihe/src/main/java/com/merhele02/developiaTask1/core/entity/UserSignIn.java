package com.merhele02.developiaTask1.core.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserSignIn {

    private String username;
    private String password;

}

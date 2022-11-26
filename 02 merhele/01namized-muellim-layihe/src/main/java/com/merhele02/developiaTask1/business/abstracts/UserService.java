package com.merhele02.developiaTask1.business.abstracts;

import com.merhele02.developiaTask1.entities.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();

    public User add(User user);

    public void delete(Integer id);

    public User editUser(Integer id, User user);

}

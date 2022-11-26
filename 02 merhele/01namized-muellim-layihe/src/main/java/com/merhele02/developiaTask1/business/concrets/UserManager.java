package com.merhele02.developiaTask1.business.concrets;

import com.merhele02.developiaTask1.business.abstracts.UserService;
import com.merhele02.developiaTask1.dataAcces.UserRepository;
import com.merhele02.developiaTask1.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserManager implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User add(User user) {
        this.userRepository.save(user);
        return user;
    }

    @Override
    public void delete(Integer id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public User editUser(Integer id, User user) {
        Optional<User> findingUsers = userRepository.findById(id);
        if (findingUsers.isPresent()) {
            User newUsers = findingUsers.get();

            newUsers.setUsername(user.getUsername());
            newUsers.setPassword(user.getPassword());

            return userRepository.save(newUsers);
        }
        return null;
    }
}

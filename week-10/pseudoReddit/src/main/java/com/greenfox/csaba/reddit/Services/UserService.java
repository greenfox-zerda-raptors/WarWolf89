package com.greenfox.csaba.reddit.Services;

import com.greenfox.csaba.reddit.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by almasics on 2017.01.05..
 */
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public User get(Long id) {
        return userRepository.findOne(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

}

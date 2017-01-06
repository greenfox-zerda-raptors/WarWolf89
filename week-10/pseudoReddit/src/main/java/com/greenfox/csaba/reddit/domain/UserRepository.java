package com.greenfox.csaba.reddit.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by almasics on 2017.01.05..
 */
public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUserName(String username);
}

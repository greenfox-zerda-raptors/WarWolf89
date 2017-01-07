package com.greenfox.csaba.reddit.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by almasics on 2017.01.06..
 */
@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
    @Query("select a.userRole from UserRole a, User b where b.userName=?1 and a.userid=b.userId")
    public List<String>
    findRoleByUserName(String username);
}

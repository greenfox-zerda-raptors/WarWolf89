package com.greenfox.csaba.reddit.domain;

import javax.persistence.*;

/**
 * Created by almasics on 2017.01.06..
 */
@Entity
@Table(name = "userrole")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_role_id")
    private Long userRoleId;

    @Column(name = "userid")
    private long userid;

    @Column(name = "role")
    private String userRole;

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }


}

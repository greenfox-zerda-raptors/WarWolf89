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
    private String role;

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}

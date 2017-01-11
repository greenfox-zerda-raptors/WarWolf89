package com.greenfox.exams.spring.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by almasics on 2017.01.11..
 */
@Entity
@Table
public class UserFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 2, max = 80)
    private String textFeedback;

    @Email
    private String email;

    @Range(min = 1, max = 10)
    private Integer rating;

    public UserFeedback() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextFeedback() {
        return textFeedback;
    }

    public void setTextFeedback(String textFeedback) {
        this.textFeedback = textFeedback;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

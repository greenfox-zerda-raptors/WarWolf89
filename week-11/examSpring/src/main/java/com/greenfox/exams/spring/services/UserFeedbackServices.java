package com.greenfox.exams.spring.services;

import com.greenfox.exams.spring.domain.UserFeedback;
import com.greenfox.exams.spring.repositories.UserFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by almasics on 2017.01.11..
 */
@Service
public class UserFeedbackServices {
    UserFeedbackRepository userFeedbackRepository;

    @Autowired
    public UserFeedbackServices(UserFeedbackRepository userFeedbackRepository) {
        this.userFeedbackRepository = userFeedbackRepository;
    }

    public UserFeedback saveData(UserFeedback userFeedback) {
        return userFeedbackRepository.save(userFeedback);
    }

    public Iterable<UserFeedback> list() {
        return userFeedbackRepository.findAll();
    }

}

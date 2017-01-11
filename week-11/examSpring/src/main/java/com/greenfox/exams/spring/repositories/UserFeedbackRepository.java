package com.greenfox.exams.spring.repositories;

import com.greenfox.exams.spring.domain.UserFeedback;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by almasics on 2017.01.11..
 */
public interface UserFeedbackRepository extends CrudRepository<UserFeedback, Long> {
}

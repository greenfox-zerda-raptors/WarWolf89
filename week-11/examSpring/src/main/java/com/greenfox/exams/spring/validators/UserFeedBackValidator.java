package com.greenfox.exams.spring.validators;

import com.greenfox.exams.spring.domain.UserFeedback;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by almasics on 2017.01.11..
 */
public class UserFeedBackValidator implements Validator {


    @Override
    public boolean supports(Class<?> paramClass) {
        return UserFeedback.class.equals(paramClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "textFeedback", "Come on we need feedback");

        UserFeedback userFeedback = (UserFeedback) obj;
        if (!checkIfAnswerIsAcceptable(userFeedback)) {
            errors.rejectValue("textFeedback", " ", "you have to positive!");
        }

    }

    public boolean checkIfAnswerIsAcceptable(UserFeedback userFeedback) {
        boolean isItEnough;
        String[] mustHaveWord = {"amazing", "awesome", "blithesome", "excellent", "fabulous", "fantastic", "favorable", "fortuitous", "great", "incredible", "ineffable", "mirthful", "outstanding", "perfect", "propitious", "remarkable", "smart", "spectacular", "splendid", "stellar", "stupendous", "super", "ultimate", "unbelievable", "wondrous"};
        int counter = 0;
        for (String s : mustHaveWord) {
            if (userFeedback.getTextFeedback().contains(s)) {
                counter++;
            }
        }
        isItEnough = counter >= 3;
        return isItEnough;
    }
}

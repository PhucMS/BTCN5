package com.bookstore.validator;

import com.bookstore.entity.User;
import jakarta.validation.ConstraintValidatorContext;
import com.bookstore.repository.IUserRepository;
import jakarta.validation.ConstraintValidator;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext){
        if(user == null){
            return true;
        }
        return user.getId() != null;
    }
}

package simplon.com.mcq.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import simplon.com.mcq.repositories.UserRepository;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    private final UserRepository users;

    public UniqueUsernameValidator(UserRepository users) {
	this.users = users;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
	if (value == null) {
	    return true;
	}
	return !users.existsByUsername(value);
    }

}

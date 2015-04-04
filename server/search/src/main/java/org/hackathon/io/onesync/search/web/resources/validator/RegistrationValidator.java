package org.hackathon.io.onesync.search.web.resources.validator;

import org.hackathon.io.onesync.search.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class RegistrationValidator implements Validator {

	public boolean supports(Class<?> c) {
		return User.class.isAssignableFrom(c);
	}

	public void validate(Object newUser, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "field.username.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.password.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "field.firstName.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.email.empty");
		User usrBean = (User) newUser;
	}

}

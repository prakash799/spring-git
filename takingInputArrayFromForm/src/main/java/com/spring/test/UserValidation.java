package com.spring.test;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component("registrationvalidator")
public class UserValidation  implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		User user=(User) target;

		if(user.getFirstName()!=null && user.getFirstName().equals("")){
			errors.rejectValue("firstName", "error.firstName");
		}
		
		if(user.getLastName()!=null && user.getLastName().equals("")){
			errors.rejectValue("lastName", "error.lastName");
		}
		
		if(user.getAddress()!=null && user.getAddress().equals("")){
			errors.rejectValue("address", "error.address");
		}
		
		if(user.getEmail()!=null && user.getEmail().equals("")){
			errors.rejectValue("email", "error.email");
		}
		
		if(user.getPassword()!=null && user.getPassword().equals("")){
			errors.rejectValue("password", "error.password");
		}
		
	}

}

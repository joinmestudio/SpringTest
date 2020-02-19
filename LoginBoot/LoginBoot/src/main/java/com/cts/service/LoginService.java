package com.cts.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cts.bean.LoginBean;
@Service
public class LoginService implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return LoginBean.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		ValidationUtils.rejectIfEmpty(arg1, "username",
				"username.required"," username is required");
		
		ValidationUtils.rejectIfEmpty(arg1, "password",
				"password.required","password is required");
		LoginBean loginBean=(LoginBean)arg0;
		if(loginBean.getUsername().length()<5){
		arg1.rejectValue("username","username.length","username length must be >= 5");
		}
		
		
	}

}

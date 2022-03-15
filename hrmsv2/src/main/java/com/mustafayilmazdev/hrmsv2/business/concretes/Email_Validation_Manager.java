package com.mustafayilmazdev.hrmsv2.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.hrmsv2.business.abstracts.Email_Validation_Service;
import com.mustafayilmazdev.hrmsv2.core.utilities.results.Result;
import com.mustafayilmazdev.hrmsv2.core.utilities.results.Success_Result;
import com.mustafayilmazdev.hrmsv2.data_access.abstracts.Email_Validation_Dao;
import com.mustafayilmazdev.hrmsv2.entities.abstracts.User;

@Service
public class Email_Validation_Manager implements Email_Validation_Service {
	Email_Validation_Dao email_Validation_Dao;

	@Autowired
	public Email_Validation_Manager(Email_Validation_Dao email_Validation_Dao) {
		super();
		this.email_Validation_Dao = email_Validation_Dao;
	}

	@Override
	public Result validateEmail(User user) {
		return new Success_Result();
	}

}

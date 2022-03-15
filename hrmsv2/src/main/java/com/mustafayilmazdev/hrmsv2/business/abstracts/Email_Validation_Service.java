package com.mustafayilmazdev.hrmsv2.business.abstracts;

import com.mustafayilmazdev.hrmsv2.core.utilities.results.Result;
import com.mustafayilmazdev.hrmsv2.entities.abstracts.User;

public interface Email_Validation_Service {
	public Result validateEmail(User user);
}

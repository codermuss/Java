package com.mustafayilmazdev.hrmsv2.business.abstracts;

import com.mustafayilmazdev.hrmsv2.core.utilities.results.Result;
import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Seeker;

public interface Job_Seeker_Service {
	public Result add(Job_Seeker job_Seeker);
}

package com.mustafayilmazdev.Hrmsmy.business.abstracts;

import java.util.List;

import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobSeeker;

public interface JobSeekerService {
	public Result add(JobSeeker jobSeeker);

	public Data_Result<List<JobSeeker>> getAll();

}

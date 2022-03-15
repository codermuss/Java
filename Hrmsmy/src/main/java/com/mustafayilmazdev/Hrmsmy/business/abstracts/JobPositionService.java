package com.mustafayilmazdev.Hrmsmy.business.abstracts;

import java.util.List;

import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobPosition;

public interface JobPositionService {
	public Data_Result<List<JobPosition>> getAll();

	public Result add(JobPosition jobPosition);
}

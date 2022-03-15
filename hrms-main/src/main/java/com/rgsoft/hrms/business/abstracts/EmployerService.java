package com.rgsoft.hrms.business.abstracts;

import java.util.List;

import com.rgsoft.hrms.core.utilities.results.DataResult;
import com.rgsoft.hrms.core.utilities.results.Result;
import com.rgsoft.hrms.entities.concretes.Employer;

public interface EmployerService {
	public Result add(Employer employer);
	public DataResult<List<Employer>> findAll();
}

package com.mustafayilmazdev.Hrmsmy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.JobPositionService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Error_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Result;
import com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts.JobPositionDao;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public Data_Result<List<JobPosition>> getAll() {

		return new Success_Data_Result<List<JobPosition>>(this.jobPositionDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {

		Data_Result<List<JobPosition>> dataResult = this.getAll();
		List<JobPosition> jobPositionList = dataResult.getData();
		for (JobPosition jobPosition_DataResult : jobPositionList) {
			if (jobPosition_DataResult.getPosition_name().toLowerCase()
					.compareTo(jobPosition.getPosition_name().toLowerCase()) == 0) {
				return new Error_Result("This job position already exist in system");
			}
		}
		this.jobPositionDao.save(jobPosition);
		return new Success_Result("Job Position added successfully ");
	}

}

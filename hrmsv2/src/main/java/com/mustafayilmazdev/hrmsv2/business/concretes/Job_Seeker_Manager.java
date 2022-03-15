package com.mustafayilmazdev.hrmsv2.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.hrmsv2.business.abstracts.Job_Seeker_Service;
import com.mustafayilmazdev.hrmsv2.core.utilities.results.Error_Result;
import com.mustafayilmazdev.hrmsv2.core.utilities.results.Result;
import com.mustafayilmazdev.hrmsv2.core.utilities.results.Success_Result;
import com.mustafayilmazdev.hrmsv2.core.utilities.services.Mernis_Service;
import com.mustafayilmazdev.hrmsv2.data_access.abstracts.Job_Seeker_Dao;
import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Seeker;

@Service
public class Job_Seeker_Manager implements Job_Seeker_Service {

	private Job_Seeker_Dao job_Seeker_Dao;

	@Autowired
	public Job_Seeker_Manager(Job_Seeker_Dao job_Seeker_Dao) {
		super();
		this.job_Seeker_Dao = job_Seeker_Dao;

	}

	@Override
	public Result add(Job_Seeker job_Seeker) {
		if (new Mernis_Service().validateUserInfo(Long.parseLong(job_Seeker.getTc_no()),
				job_Seeker.getFirst_name().toUpperCase(), job_Seeker.getLast_name().toUpperCase(), 1997)) {

			this.job_Seeker_Dao.save(job_Seeker);

			return new Success_Result("Kullanici kayit edildi");
		}
		return new Error_Result("Kullanici kayit edilemedi");
	}

}

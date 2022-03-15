package com.mustafayilmazdev.Hrmsmy.business.concretes;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.JobAdvertisementService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Error_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Result;
import com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts.JobAdvetrisementDao;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobAdvertisement;
import com.mustafayilmazdev.Hrmsmy.entities.dtos.JobAdvertisementDetailsDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	JobAdvetrisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvetrisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;

	}

	@Override
	public Result saveJobAdvertisement(String job_description, int job_position_id, int number_of_open_positions,
			int min_salary, int max_salary, Date application_deadline, int city_id, int user_id, Date release_date,
			String job_title) {

		try {
			this.jobAdvertisementDao.saveJobAdvertisement(job_description, job_position_id, number_of_open_positions,
					min_salary, max_salary, application_deadline, city_id, user_id, release_date, job_title);
			return new Success_Result("Job advertisement added successfully");
		} catch (Exception e) {
			return new Error_Result(e.getMessage());
		}

	}

	/*
	 * @Override public Data_Result<List<JobAdvertisement>>
	 * getAllActiveJobAdvertisements() { return new
	 * Success_Data_Result<List<JobAdvertisement>>(this.jobAdvertisementDao.
	 * getAllActiveJobAdvertisements(),
	 * "Active Job Advertisements listed successfully"); }
	 * 
	 * @Override public Data_Result<List<JobAdvertisement>>
	 * getAllActiveJobAdvertisementsSorted() { Sort sort =
	 * Sort.by(Sort.Direction.DESC, "releaseDate"); return new
	 * Success_Data_Result<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(
	 * sort), "Job advertisements listed by relase date successfully"); }
	 * 
	 * @Override public Data_Result<List<JobAdvertisement>>
	 * getAllActiveJobAdvertisementsByEmployers(int user_id) { return new
	 * Success_Data_Result<List<JobAdvertisement>>(
	 * this.jobAdvertisementDao.getAllActiveJobAdvertisementsByEmployers(user_id),
	 * "Job advertisements listed by employer successfully"); }
	 */
	@Override
	public Data_Result<List<JobAdvertisementDetailsDto>> getAllActiveJobAdvertisementsDetails() {
		return new Success_Data_Result<List<JobAdvertisementDetailsDto>>(
				this.jobAdvertisementDao.getAllActiveJobAdvertisementsDetails(),
				"Job advertisements listed with details successfully");
	}

	@Override
	public Data_Result<List<JobAdvertisementDetailsDto>> getAllActiveJobAdvertisementsDetailsByEmployers(
			@RequestParam int user_id) {
		return new Success_Data_Result<List<JobAdvertisementDetailsDto>>(
				this.jobAdvertisementDao.getAllActiveJobAdvertisementsDetailsByEmployers(user_id),
				"Job advertisements successfully listed by employers ");
	}

	@Override
	public Data_Result<List<JobAdvertisementDetailsDto>> getAllActiveJobAdvertisementsDetailsSorted() {
		return new Success_Data_Result<List<JobAdvertisementDetailsDto>>(
				this.jobAdvertisementDao.getAllActiveJobAdvertisementsDetailsSorted(),
				"Sorted Job advertisements successfully listed  ");
	}

	@Override
	public Result save(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new Success_Result("Job Advertisement added successfully");
	}

}

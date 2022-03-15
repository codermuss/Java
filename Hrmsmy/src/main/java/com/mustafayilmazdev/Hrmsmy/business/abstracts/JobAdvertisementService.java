package com.mustafayilmazdev.Hrmsmy.business.abstracts;

import java.sql.Date;
import java.util.List;

import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobAdvertisement;
import com.mustafayilmazdev.Hrmsmy.entities.dtos.JobAdvertisementDetailsDto;

public interface JobAdvertisementService {

	Result saveJobAdvertisement(String job_description, int job_position_id, int number_of_open_positions,
			int min_salary, int max_salary, Date application_deadline, int city_id, int user_id, Date release_date,
			String job_title);

	Result save(JobAdvertisement jobAdvertisement);
	/*
	 * Data_Result<List<JobAdvertisement>> getAllActiveJobAdvertisements();
	 * 
	 * Data_Result<List<JobAdvertisement>> getAllActiveJobAdvertisementsSorted();
	 * 
	 * Data_Result<List<JobAdvertisement>>
	 * getAllActiveJobAdvertisementsByEmployers(int user_id);
	 */

	Data_Result<List<JobAdvertisementDetailsDto>> getAllActiveJobAdvertisementsDetails();

	Data_Result<List<JobAdvertisementDetailsDto>> getAllActiveJobAdvertisementsDetailsSorted();

	Data_Result<List<JobAdvertisementDetailsDto>> getAllActiveJobAdvertisementsDetailsByEmployers(int user_id);
}

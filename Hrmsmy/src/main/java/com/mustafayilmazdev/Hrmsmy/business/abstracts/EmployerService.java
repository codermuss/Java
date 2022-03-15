package com.mustafayilmazdev.Hrmsmy.business.abstracts;

import java.sql.Date;
import java.util.List;

import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.Employer;

public interface EmployerService {
	public Result add(Employer employer);

	public Data_Result<List<Employer>> getAll();

	Result addJobAdvertisement(String job_description, int job_position_id, int number_of_open_positions,
			int min_salary, int max_salary, Date application_deadline, int city_id, int user_id, Date release_date,
			String job_title);

	Result setJobAdvertisementStatu(int job_advertisement_id, boolean is_active);
}

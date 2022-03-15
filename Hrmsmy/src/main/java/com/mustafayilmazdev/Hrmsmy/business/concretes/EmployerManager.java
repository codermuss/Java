package com.mustafayilmazdev.Hrmsmy.business.concretes;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.EmployerService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Error_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Result;
import com.mustafayilmazdev.Hrmsmy.core.services.concretes.FakeMailValidationManager;
import com.mustafayilmazdev.Hrmsmy.core.services.concretes.FakeSystemUserValidationManager;
import com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts.EmployerDao;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		String[] part = employer.getEmail().split("@");
		if ((new FakeSystemUserValidationManager().validateCompanyAccount())
				&& (new FakeMailValidationManager().checkEmail())) {

			Data_Result<List<Employer>> employers = this.getAll();

			for (Employer employer_inDatabase : employers.getData()) {
				if (employer_inDatabase.getEmail().toLowerCase().compareTo(employer.getEmail().toLowerCase()) == 0) {
					return new Error_Result("This email already exist in system");
				}
			}

			if (employer.getWeb_address().compareTo(part[1]) != 0) {
				return new Error_Result("Web site and email domain is not same");
			}
			this.employerDao.save(employer);
			return new Success_Result("Employer added successfully ");

		}
		return new Error_Result("Employer not added");

	}

	@Override
	public Data_Result<List<Employer>> getAll() {

		return new Success_Data_Result<List<Employer>>(this.employerDao.findAll(), "Data listed successfully");
	}

	@Override
	public Result setJobAdvertisementStatu(int job_advertisement_id, boolean is_active) {
		this.employerDao.setJobAdvertisementStatu(job_advertisement_id, is_active);
		return new Success_Result("Job advertisement statu changed successfully");
	}

	@Override
	public Result addJobAdvertisement(String job_description, int job_position_id, int number_of_open_positions,
			int min_salary, int max_salary, Date application_deadline, int city_id, int user_id, Date release_date,
			String job_title) {
		try {
			this.employerDao.addJobAdvertisement(job_description, job_position_id, number_of_open_positions, min_salary,
					max_salary, application_deadline, city_id, user_id, release_date, job_title);
			return new Success_Result("Job advertisement added successfully");
		} catch (Exception e) {
			return new Error_Result(e.getMessage());
		}
	}

}

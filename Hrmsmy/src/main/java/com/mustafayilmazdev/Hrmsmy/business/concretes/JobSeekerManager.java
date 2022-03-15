package com.mustafayilmazdev.Hrmsmy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.JobSeekerService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Error_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Result;
import com.mustafayilmazdev.Hrmsmy.core.services.concretes.FakeMailValidationManager;
import com.mustafayilmazdev.Hrmsmy.core.services.concretes.MernisUserCheckManager;
import com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts.JobSeekerDao;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if ((new MernisUserCheckManager().checkIfRealPerson(Long.parseLong(jobSeeker.getNationality_id()),
				jobSeeker.getFirst_name().toUpperCase(), jobSeeker.getLast_name().toUpperCase(), 1997))
				&& (new FakeMailValidationManager().checkEmail())) {

			Data_Result<List<JobSeeker>> users = this.getAll();
			for (JobSeeker user : users.getData()) {
				if (user.getEmail().toLowerCase().compareTo(jobSeeker.getEmail().toLowerCase()) == 0) {
					return new Error_Result("This email already exist in system");
				}
				if (user.getNationality_id().toLowerCase()
						.compareTo(jobSeeker.getNationality_id().toLowerCase()) == 0) {
					return new Error_Result("This nationality id already exist in system");
				}

			}

			this.jobSeekerDao.save(jobSeeker);
			return new Success_Result("User registered successfuly ");
		}
		return new Error_Result("User not registered");

	}

	@Override
	public Data_Result<List<JobSeeker>> getAll() {
		return new Success_Data_Result<List<JobSeeker>>(this.jobSeekerDao.findAll(), "Data listed successfully");
	}

}

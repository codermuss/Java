package com.mustafayilmazdev.Hrmsmy.api.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.EmployerService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {

	EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);

	}

	@GetMapping("/getall")
	public Data_Result<List<Employer>> getAll() {
		return this.employerService.getAll();
	}

	@PostMapping("/addJobAdvertisement")
	public Result addJobAdvertisement(String job_description, int job_position_id, int number_of_open_positions,
			int min_salary, int max_salary, Date application_deadline, int city_id, int user_id, Date release_date,
			String job_title) {
		return this.employerService.addJobAdvertisement(job_description, job_position_id, number_of_open_positions,
				min_salary, max_salary, application_deadline, city_id, user_id, release_date, job_title);
	}

	@PostMapping("/setJobAdvertisementStatu")
	public Result setJobAdvertisementStatu(int job_advertisement_id, boolean is_active) {
		return this.employerService.setJobAdvertisementStatu(job_advertisement_id, is_active);
	}

}

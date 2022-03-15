package com.mustafayilmazdev.Hrmsmy.api.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.JobAdvertisementService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobAdvertisement;
import com.mustafayilmazdev.Hrmsmy.entities.dtos.JobAdvertisementDetailsDto;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController {
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;

	}

	@PostMapping("/saveJobAdvertisement")
	public Result saveJobAdvertisement(@RequestParam String job_description, @RequestParam int job_position_id,
			@RequestParam int number_of_open_positions, @RequestParam int min_salary, @RequestParam int max_salary,
			@RequestParam Date application_deadline, @RequestParam int city_id, @RequestParam int user_id,
			@RequestParam Date release_date, @RequestParam String job_title) {
		return this.jobAdvertisementService.saveJobAdvertisement(job_description, job_position_id,
				number_of_open_positions, min_salary, max_salary, application_deadline, city_id, user_id, release_date,
				job_title);
	}

	@PostMapping("/save")
	public Result save(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.save(jobAdvertisement);
	}

	/*
	 * @GetMapping("/getAllActiveJobAdvertisements") public
	 * Data_Result<List<JobAdvertisement>> getAllActiveJobAdvertisements() { return
	 * this.jobAdvertisementService.getAllActiveJobAdvertisements(); }
	 * 
	 * @GetMapping("/getAllActiveJobAdvertisementsSorted") public
	 * Data_Result<List<JobAdvertisement>> getAllActiveJobAdvertisementsSorted() {
	 * return this.jobAdvertisementService.getAllActiveJobAdvertisementsSorted(); }
	 * 
	 * @GetMapping("/getAllActiveJobAdvertisementsByEmployers") public
	 * Data_Result<List<JobAdvertisement>>
	 * getAllActiveJobAdvertisementsByEmployers(int user_id) { return
	 * this.jobAdvertisementService.getAllActiveJobAdvertisementsByEmployers(user_id
	 * ); }
	 */

	@GetMapping("/getAllActiveJobAdvertisementsDetails")
	public Data_Result<List<JobAdvertisementDetailsDto>> getAllActiveJobAdvertisementsDetails() {
		return this.jobAdvertisementService.getAllActiveJobAdvertisementsDetails();
	}

	@GetMapping("/getAllActiveJobAdvertisementsDetailsByEmployers")
	public Data_Result<List<JobAdvertisementDetailsDto>> getAllActiveJobAdvertisementsDetailsByEmployers(int user_id) {
		return this.jobAdvertisementService.getAllActiveJobAdvertisementsDetailsByEmployers(user_id);
	}

	@GetMapping("/getAllActiveJobAdvertisementsDetailsSorted")
	public Data_Result<List<JobAdvertisementDetailsDto>> getAllActiveJobAdvertisementsDetailsSorted() {
		return this.jobAdvertisementService.getAllActiveJobAdvertisementsDetailsSorted();
	}
}

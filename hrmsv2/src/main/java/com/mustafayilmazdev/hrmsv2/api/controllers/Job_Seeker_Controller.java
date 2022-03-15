package com.mustafayilmazdev.hrmsv2.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.hrmsv2.business.abstracts.Job_Seeker_Service;
import com.mustafayilmazdev.hrmsv2.core.utilities.results.Result;
import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Seeker;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/job_seeker")
public class Job_Seeker_Controller {

	private Job_Seeker_Service job_Seeker_Service;

	@Autowired
	public Job_Seeker_Controller(Job_Seeker_Service job_Seeker_Service) {
		super();
		this.job_Seeker_Service = job_Seeker_Service;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Job_Seeker job_Seeker) {
		return this.job_Seeker_Service.add(job_Seeker);
	}

}

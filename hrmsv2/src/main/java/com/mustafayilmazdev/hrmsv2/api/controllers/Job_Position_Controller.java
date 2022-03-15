package com.mustafayilmazdev.hrmsv2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.hrmsv2.business.abstracts.Job_Position_Service;
import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Position;
import com.mustafayilmazdev.hrmsv2.entities.dtos.Job_Position_Dto;

@RestController
@RequestMapping("/api/job_position")
public class Job_Position_Controller {

	Job_Position_Service job_Position_Service;

	@Autowired
	public Job_Position_Controller(Job_Position_Service job_Position_Service) {
		super();
		this.job_Position_Service = job_Position_Service;
	}

	@GetMapping("/getall")
	public List<Job_Position> getAll() {
		return this.job_Position_Service.getAll();
	}

	@PostMapping("/saveJobPosition")
	public void saveJobPosition(int id, String name) {
		this.job_Position_Service.saveJobPosition(id, name);
	}

	@PostMapping("/saveJobPositionWithDto")
	public void saveJobPositionWithDto(@RequestBody Job_Position_Dto job_Position_Dto) {
		this.job_Position_Service.saveJobPositionWithDto(job_Position_Dto);
	}

	@PostMapping("/saveJobPositionWithConverter")
	public void saveJobPositionWithConverter(Job_Position_Dto job_Position_Dto) {
		this.job_Position_Service.saveJobPositionWithConverter(job_Position_Dto);
	}
}

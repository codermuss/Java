package com.mustafayilmazdev.hrmsv2.business.abstracts;

import java.util.List;

import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Position;
import com.mustafayilmazdev.hrmsv2.entities.dtos.Job_Position_Dto;

public interface Job_Position_Service {
	public List<Job_Position> getAll();

	public void saveJobPosition(int id, String name);

	public void saveJobPositionWithDto(Job_Position_Dto job_Position_Dto);

	void saveJobPositionWithConverter(Job_Position_Dto job_Position_Dto);
}

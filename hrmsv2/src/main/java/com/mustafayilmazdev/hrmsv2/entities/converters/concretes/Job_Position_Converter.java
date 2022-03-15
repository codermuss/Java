package com.mustafayilmazdev.hrmsv2.entities.converters.concretes;

import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Position;
import com.mustafayilmazdev.hrmsv2.entities.dtos.Job_Position_Dto;

public class Job_Position_Converter {

	public Job_Position dtoToEntity(Job_Position_Dto job_Position_Dto) {
		Job_Position jp = new Job_Position();
		jp.setPosition_name(job_Position_Dto.getName());
		return jp;
	}

}

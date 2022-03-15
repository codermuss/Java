package com.mustafayilmazdev.hrmsv2.entities.converters.abstracts;

import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Position;
import com.mustafayilmazdev.hrmsv2.entities.dtos.Job_Position_Dto;

public interface Converter {
	public Job_Position dtoToEntity(Job_Position_Dto job_Position_Dto);
}

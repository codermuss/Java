package com.mustafayilmazdev.hrmsv2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.hrmsv2.business.abstracts.Job_Position_Service;
import com.mustafayilmazdev.hrmsv2.data_access.abstracts.Job_Position_Dao;
import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Position;
import com.mustafayilmazdev.hrmsv2.entities.converters.concretes.Job_Position_Converter;
import com.mustafayilmazdev.hrmsv2.entities.dtos.Job_Position_Dto;

@Service
public class Job_Position_Manager implements Job_Position_Service {

	Job_Position_Dao job_Position_Dao;
	Job_Position_Converter jpc;

	@Autowired
	public Job_Position_Manager(Job_Position_Dao job_Position_Dao) {
		super();
		this.job_Position_Dao = job_Position_Dao;

	}

	@Override
	public List<Job_Position> getAll() {
		// TODO Auto-generated method stub
		return this.job_Position_Dao.findAll();
	}

	@Override
	public void saveJobPosition(int id, String name) {

		this.job_Position_Dao.saveJobPosition(id, name);

	}

	@Override
	public void saveJobPositionWithDto(Job_Position_Dto job_Position_Dto) {
		this.job_Position_Dao.saveJobPositionWithDto(job_Position_Dto);

	}

	@Override
	public void saveJobPositionWithConverter(Job_Position_Dto job_Position_Dto) {
		this.jpc = new Job_Position_Converter();
		Job_Position jp = jpc.dtoToEntity(job_Position_Dto);
		this.job_Position_Dao.save(jp);

	}

}

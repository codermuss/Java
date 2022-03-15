package com.mustafayilmazdev.hrmsv2.data_access.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Position;
import com.mustafayilmazdev.hrmsv2.entities.dtos.Job_Position_Dto;

public interface Job_Position_Dao extends JpaRepository<Job_Position, Integer> {
	@Transactional
	@Modifying
	@Query(value = "insert into job_positions(id,position_name) values(:job_position_id,:job_position_name)", nativeQuery = true)
	void saveJobPosition(@Param("job_position_id") int job_position_id,
			@Param("job_position_name") String job_position_name);

	@Transactional
	@Modifying
	@Query(value = "insert into job_positions(id,position_name values(:j.id,:j.name)", nativeQuery = true)
	void saveJobPositionWithDto(@Param("j.name") Job_Position_Dto job_Position_Dto);

}

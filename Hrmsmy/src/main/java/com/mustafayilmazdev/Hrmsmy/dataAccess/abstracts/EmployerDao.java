package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.Employer;

public interface EmployerDao extends UserDao<Employer> {

	@Transactional
	@Modifying
	@Query(value = "Insert into job_advertisements(job_description,job_position_id,number_of_open_positions,min_salary,max_salary,application_deadline,city_id,user_id,release_date,job_title) "
			+ "values(:job_description,:job_position_id,:number_of_open_positions,:min_salary,:max_salary,:application_deadline,:city_id,:user_id,:release_date,:job_title)", nativeQuery = true)
	void addJobAdvertisement(@Param("job_description") String job_description,
			@Param("job_position_id") int job_position_id,
			@Param("number_of_open_positions") int number_of_open_positions, @Param("min_salary") int min_salary,
			@Param("max_salary") int max_salary, @Param("application_deadline") Date application_deadline,
			@Param("city_id") int city_id, @Param("user_id") int user_id, @Param("release_date") Date release_date,
			@Param("job_title") String job_title);

	@Transactional
	@Modifying
	@Query(value = "update job_advertisements set is_active=:is_active where job_advertisement_id=:job_advertisement_id", nativeQuery = true)
	void setJobAdvertisementStatu(@Param("job_advertisement_id") int job_advertisement_id,
			@Param("is_active") boolean is_active);
}

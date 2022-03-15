package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobAdvertisement;
import com.mustafayilmazdev.Hrmsmy.entities.dtos.JobAdvertisementDetailsDto;

public interface JobAdvetrisementDao extends JpaRepository<JobAdvertisement, Integer> {
//	//
//	@Query(value = "select* from job_advertisements where release_date=:release_date and is_active=true", nativeQuery = true)
//	List<JobAdvertisement> getByReleaseDateAndIsActive(@Param("release_date") Date release_date);

	// Job advertisement adding
	@Transactional
	@Modifying
	@Query(value = "Insert into job_advertisements(job_description,job_position_id,number_of_open_positions,min_salary,max_salary,application_deadline,city_id,user_id,release_date,job_title) "
			+ "values(:job_description,:job_position_id,:number_of_open_positions,:min_salary,:max_salary,:application_deadline,:city_id,:user_id,:release_date,:job_title)", nativeQuery = true)
	void saveJobAdvertisement(@Param("job_description") String job_description,
			@Param("job_position_id") int job_position_id,
			@Param("number_of_open_positions") int number_of_open_positions, @Param("min_salary") int min_salary,
			@Param("max_salary") int max_salary, @Param("application_deadline") Date application_deadline,
			@Param("city_id") int city_id, @Param("user_id") int user_id, @Param("release_date") Date release_date,
			@Param("job_title") String job_title);
	// Job advertisement adding

	@Query(value = "select * from job_advertisements where is_active=true", nativeQuery = true)
	List<JobAdvertisement> getAllActiveJobAdvertisements();

	@Query(value = "select * from job_advertisements where user_id=:user_id", nativeQuery = true)
	List<JobAdvertisement> getAllActiveJobAdvertisementsByEmployers(@Param("user_id") int user_id);
//	// String olarak deneme kullanılmayacak
//	@Query(value = "select  company_name, position_name, number_of_open_positions,release_date, application_deadline from job_advertisements, cities, employers, job_positions where job_advertisements.city_id=cities.city_id and job_advertisements.user_id=employers.user_id and job_advertisements.job_position_id=job_positions.job_position_id\r\n"
//			+ "and employers.user_id=:user_id and job_advertisements.is_active=true ", nativeQuery = true)
//	List<String> getJobAdvertisements(@Param("user_id") int user_id);

	// DTOS

	@Query("select new com.mustafayilmazdev.Hrmsmy.entities.dtos.JobAdvertisementDetailsDto(e.companyName,jp.position_name,j.number_of_open_positions,j.releaseDate,j.application_deadline) from JobAdvertisement j inner join j.employer e inner join j.job_position jp where j.isActive=true")
	List<JobAdvertisementDetailsDto> getAllActiveJobAdvertisementsDetails();

	@Query("select new com.mustafayilmazdev.Hrmsmy.entities.dtos.JobAdvertisementDetailsDto(e.companyName,jp.position_name,j.number_of_open_positions,j.releaseDate,j.application_deadline) from JobAdvertisement j inner join j.employer e inner join j.job_position jp where j.isActive=true and j.employer.userId=:user_id")
	List<JobAdvertisementDetailsDto> getAllActiveJobAdvertisementsDetailsByEmployers(@Param("user_id") int user_id);

	@Query("select new com.mustafayilmazdev.Hrmsmy.entities.dtos.JobAdvertisementDetailsDto(e.companyName,jp.position_name,j.number_of_open_positions,j.releaseDate,j.application_deadline) from JobAdvertisement j inner join j.employer e inner join j.job_position jp where j.isActive=true order by j.releaseDate desc")
	List<JobAdvertisementDetailsDto> getAllActiveJobAdvertisementsDetailsSorted();

}

package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer> {

	@Transactional
	@Modifying
	@Query(value = "select distinct * from resumes r, experiences e,educational_backgrounds eb where r.resume_id=e.resume_id and r.resume_id=eb.resume_id", nativeQuery = true)
	List<Resume> getAllResumes();

	// @Query("select new
	// com.mustafayilmazdev.Hrmsmy.entities.dtos.ExperienceDto(eb.resume_id) from
	// EducationalBackground eb, Experience e where eb.resume_id=e.resume_id")
	// List<ResumeDto> getAllResume();
}

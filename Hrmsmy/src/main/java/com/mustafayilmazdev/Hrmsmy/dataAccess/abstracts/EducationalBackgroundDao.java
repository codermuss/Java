package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.EducationalBackground;

public interface EducationalBackgroundDao extends JpaRepository<EducationalBackground, Integer> {
	List<EducationalBackground> getAllByResume_ResumeIdOrderByEndingDate(int resumeId);
}

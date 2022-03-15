package com.mustafayilmazdev.Hrmsmy.business.abstracts;

import java.util.List;

import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.EducationalBackground;

public interface EducationalBackgroundService {
	Result saveEducationalBackground(EducationalBackground educationalBackground);

	Data_Result<List<EducationalBackground>> getAll();

	Data_Result<List<EducationalBackground>> getAllByResume_ResumeIdOrderByEndingDate(int resumeId);
}

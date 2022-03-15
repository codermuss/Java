package com.mustafayilmazdev.Hrmsmy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.EducationalBackgroundService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Result;
import com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts.EducationalBackgroundDao;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.EducationalBackground;

@Service
public class EducationalBackgroundManager implements EducationalBackgroundService {
	EducationalBackgroundDao educationalBackgroundDao;

	@Autowired
	public EducationalBackgroundManager(EducationalBackgroundDao educationalBackgroundDao) {
		super();
		this.educationalBackgroundDao = educationalBackgroundDao;
	}

	@Override
	public Result saveEducationalBackground(EducationalBackground educationalBackground) {
		this.educationalBackgroundDao.save(educationalBackground);
		return new Success_Result("Educational Background successfully added ");
	}

	@Override
	public Data_Result<List<EducationalBackground>> getAll() {
		return new Success_Data_Result<List<EducationalBackground>>(this.educationalBackgroundDao.findAll(),
				"Educational Backgrounds successfully listed");
	}

	@Override
	public Data_Result<List<EducationalBackground>> getAllByResume_ResumeIdOrderByEndingDate(int resumeId) {
		return new Success_Data_Result<List<EducationalBackground>>(
				this.educationalBackgroundDao.getAllByResume_ResumeIdOrderByEndingDate(resumeId),
				"Educational Backgrounds Listed");
	}

}

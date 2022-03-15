package com.mustafayilmazdev.Hrmsmy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.ExperienceService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Data_Result;
import com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts.ExperienceDao;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.Experience;

@Service
public class ExperienceManager implements ExperienceService {
	ExperienceDao experienceDao;

	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}

	@Override
	public Data_Result<Experience> saveExperience(Experience experience) {
		return new Success_Data_Result<Experience>(this.experienceDao.save(experience),
				"Experience successfully added");
	}

	@Override
	public Data_Result<List<Experience>> getAll() {
		return new Success_Data_Result<List<Experience>>(this.experienceDao.findAll(),
				"Experiences successfully listed");
	}

}

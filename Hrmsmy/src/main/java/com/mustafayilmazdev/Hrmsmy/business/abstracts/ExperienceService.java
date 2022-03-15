package com.mustafayilmazdev.Hrmsmy.business.abstracts;

import java.util.List;

import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.Experience;

public interface ExperienceService {

	Data_Result<List<Experience>> getAll();

	Data_Result<Experience> saveExperience(Experience experience);
}

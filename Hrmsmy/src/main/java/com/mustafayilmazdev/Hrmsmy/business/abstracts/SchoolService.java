package com.mustafayilmazdev.Hrmsmy.business.abstracts;

import java.util.List;

import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.School;

public interface SchoolService {

	Result saveSchool(School school);

	Data_Result<List<School>> getAll();

	Data_Result<List<School>> getAllSorted();

}

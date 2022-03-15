package com.mustafayilmazdev.Hrmsmy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.SchoolService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Result;
import com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts.SchoolDao;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.School;

@Service
public class SchoolManager implements SchoolService {

	SchoolDao schoolDao;

	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public Result saveSchool(School school) {
		this.schoolDao.save(school);
		return new Success_Result("School successfully added");
	}

	@Override
	public Data_Result<List<School>> getAll() {
		return new Success_Data_Result<List<School>>(this.schoolDao.findAll(), "");
	}

	@Override
	public Data_Result<List<School>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "educationLevel");
		return new Success_Data_Result<List<School>>(this.schoolDao.findAll(sort), "");
	}

}

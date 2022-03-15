package com.mustafayilmazdev.Hrmsmy.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.SchoolDepartmentService;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Result;
import com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts.SchoolDepartmentDao;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.SchoolDepartment;

@Service
public class SchoolDepartmentManager implements SchoolDepartmentService {

	SchoolDepartmentDao schoolDepartmentDao;

	@Autowired
	public SchoolDepartmentManager(SchoolDepartmentDao schoolDepartmentDao) {
		super();
		this.schoolDepartmentDao = schoolDepartmentDao;
	}

	@Override
	public Result saveSchoolDepartment(SchoolDepartment schoolDepartment) {
		this.schoolDepartmentDao.save(schoolDepartment);
		return new Success_Result("School Department successfully added");
	}

}

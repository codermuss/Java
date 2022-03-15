package com.mustafayilmazdev.Hrmsmy.business.abstracts;

import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.SchoolDepartment;

public interface SchoolDepartmentService {
	Result saveSchoolDepartment(SchoolDepartment schoolDepartment);
}

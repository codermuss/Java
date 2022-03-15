package com.mustafayilmazdev.Hrmsmy.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.SchoolDepartmentService;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.SchoolDepartment;

@RestController
@RequestMapping("/api/SchoolDepartmentsController")
public class SchoolDepartmentsController {

	SchoolDepartmentService schoolDepartmentService;

	@Autowired
	public SchoolDepartmentsController(SchoolDepartmentService schoolDepartmentService) {
		super();
		this.schoolDepartmentService = schoolDepartmentService;
	}

	@PostMapping("/saveSchoolDepartment")
	public Result saveSchoolDepartment(@RequestBody SchoolDepartment schoolDepartment) {
		return this.schoolDepartmentService.saveSchoolDepartment(schoolDepartment);
	}

}

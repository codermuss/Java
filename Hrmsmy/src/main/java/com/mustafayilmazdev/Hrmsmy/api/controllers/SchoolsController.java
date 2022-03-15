package com.mustafayilmazdev.Hrmsmy.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.SchoolService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.School;

@RestController
@RequestMapping("/api/SchoolsController")
public class SchoolsController {
	SchoolService schoolService;

	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}

	@PostMapping("/saveSchool")
	public Result saveSchool(@RequestBody School school) {
		return this.schoolService.saveSchool(school);
	}

	@GetMapping("/getAll")
	public Data_Result<List<School>> getAll() {
		return this.schoolService.getAll();
	}

	@GetMapping("/getAllSorted")
	public Data_Result<List<School>> getAllSorted() {
		return this.schoolService.getAllSorted();
	}
}

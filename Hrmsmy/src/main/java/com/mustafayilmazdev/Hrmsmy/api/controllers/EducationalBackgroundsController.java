package com.mustafayilmazdev.Hrmsmy.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.EducationalBackgroundService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.EducationalBackground;

@RestController
@RequestMapping("/api/EducationalBackgroundsController")
public class EducationalBackgroundsController {
	EducationalBackgroundService educationalBackgroundService;

	@Autowired
	public EducationalBackgroundsController(EducationalBackgroundService educationalBackgroundService) {
		super();
		this.educationalBackgroundService = educationalBackgroundService;
	}

	@PostMapping("/saveEducationalBackground")
	public Result saveEducationalBackground(@RequestBody EducationalBackground educationalBackground) {
		return this.educationalBackgroundService.saveEducationalBackground(educationalBackground);
	}

	@GetMapping("/getAll")
	public Data_Result<List<EducationalBackground>> getAll() {
		return this.educationalBackgroundService.getAll();
	}

	@GetMapping("/getAllByResumeIdOrderByEndingDate")
	public Data_Result<List<EducationalBackground>> getAllByResumeIdOrderByEndingDate(int resumeId) {
		return this.educationalBackgroundService.getAllByResume_ResumeIdOrderByEndingDate(resumeId);
	}
}

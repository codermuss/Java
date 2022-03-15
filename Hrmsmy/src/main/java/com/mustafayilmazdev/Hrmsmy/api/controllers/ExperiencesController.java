package com.mustafayilmazdev.Hrmsmy.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.ExperienceService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.Experience;

@RestController
@RequestMapping("/api/ExperiencesController")
public class ExperiencesController {
	ExperienceService experienceService;

	@Autowired
	public ExperiencesController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}

	@PostMapping("/saveExperience")
	public Data_Result<Experience> saveExperience(@RequestBody Experience experience) {
		return this.experienceService.saveExperience(experience);
	}

	@GetMapping("/getAll")
	public Data_Result<List<Experience>> getAll() {
		return this.experienceService.getAll();
	}

}

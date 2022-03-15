package com.mustafayilmazdev.Hrmsmy.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.ResumeService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.Resume;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {
	ResumeService resumeService;

	@Autowired
	public ResumeController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}

	@PostMapping("/saveResume")
	public Result saveResume(@RequestBody Resume resume) {
		return this.resumeService.saveResume(resume);
	}

	@GetMapping("/getAll")
	public Data_Result<List<Resume>> getAll() {
		return this.resumeService.getAll();
	}

	@GetMapping("/getAllResumes")
	public Data_Result<List<?>> getAllResumes() {
		return this.resumeService.getAllResumes();
	}

}

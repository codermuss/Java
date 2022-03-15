package com.mustafayilmazdev.Hrmsmy.business.abstracts;

import java.util.List;

import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.Resume;

public interface ResumeService {

	Result saveResume(Resume resume);

	Data_Result<List<Resume>> getAll();

	Data_Result<List<?>> getAllResumes();

	// Data_Result<List<ResumeDto>> getAllResume();
}

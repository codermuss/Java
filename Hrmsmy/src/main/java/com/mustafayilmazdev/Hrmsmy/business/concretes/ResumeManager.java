package com.mustafayilmazdev.Hrmsmy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.Hrmsmy.business.abstracts.ResumeService;
import com.mustafayilmazdev.Hrmsmy.core.results.Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Data_Result;
import com.mustafayilmazdev.Hrmsmy.core.results.Success_Result;
import com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts.ResumeDao;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService {
	ResumeDao resumeDao;

	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public Result saveResume(Resume resume) {

		this.resumeDao.save(resume);
		return new Success_Result("Resume added successfully");
	}

	@Override
	public Data_Result<List<Resume>> getAll() {
		return new Success_Data_Result<List<Resume>>(this.resumeDao.findAll(), "Resumes successfully listed");
	}

	@Override
	public Data_Result<List<?>> getAllResumes() {
		return new Success_Data_Result<List<?>>(this.resumeDao.getAllResumes(), "Resumes successfully listed");
	}

}

package com.example.hrms.service.abstracts;

import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.entity.Job;
import com.example.hrms.handler.JobTitleIsAlreadyException;
import com.example.hrms.handler.NoDataFoundException;

import java.util.List;
import java.util.Optional;

public interface JobService {
  public DataResult<List<Job>> getAllJob();

  public DataResult<Optional<Job>> getJobId(Integer id) throws NoDataFoundException;
  public boolean existsByTitle(String title);

  public Result save(Job job) throws JobTitleIsAlreadyException;

  public Job getByTitle(String jobTitle);
}

package com.example.hrms.service.concretes;

import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.core.utilities.results.concretes.SuccessResult;
import com.example.hrms.entity.Job;
import com.example.hrms.handler.JobTitleIsAlreadyException;
import com.example.hrms.handler.NoDataFoundException;
import com.example.hrms.repository.abstracts.JobRepository;
import com.example.hrms.service.abstracts.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/** Jobmanager servisi tanimlanmistir. */
@Service
public class JobManager implements JobService {

  private JobRepository repository;

  @Autowired
  public JobManager(JobRepository repository) {
    this.repository = repository;
  }

  public DataResult<List<Job>> getAllJob() {
    return new DataResult<>(repository.findAll(),true,"basariyla listelendi");
  }

  @Override
  public DataResult<Optional<Job>> getJobId(Integer id) throws NoDataFoundException {
    if(!this.repository.existsById(id)){
      throw new NoDataFoundException("bu id ye ait kayıt bulunamadi");
    }
    return new DataResult<>(repository.findById(id),true,"veri getirildi.");
  }

  @Override
  public boolean existsByTitle(String title) {
    return repository.existsByTitle(title);
  }

  @Override
  public Result save(Job job) throws JobTitleIsAlreadyException {

    if(existsByTitle(job.getTitle())){
      throw new JobTitleIsAlreadyException("Girmiş olduğunuz iş pozisyonu sistemde kayıtlıdır.");
    }
    repository.save(job);
    return new SuccessResult("kayıt başarılı");
  }

  @Override
  public Job getByTitle(String jobTitle) {
    return this.repository.getByTitle(jobTitle);
  }
}

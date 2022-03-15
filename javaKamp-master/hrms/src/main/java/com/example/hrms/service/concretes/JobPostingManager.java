package com.example.hrms.service.concretes;

import com.example.hrms.converter.FromJobPostingDtoToJobPosting;
import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.core.utilities.results.concretes.SuccessResult;
import com.example.hrms.dto.JobPostingDto;
import com.example.hrms.entity.City;
import com.example.hrms.entity.Employer;
import com.example.hrms.entity.Job;
import com.example.hrms.entity.JobPosting;
import com.example.hrms.handler.NoDataFoundException;
import com.example.hrms.repository.abstracts.CityRepository;
import com.example.hrms.repository.abstracts.EmployerRepository;
import com.example.hrms.repository.abstracts.JobPostingRepository;
import com.example.hrms.repository.abstracts.JobRepository;
import com.example.hrms.service.abstracts.JobPostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostingManager implements JobPostingService {

  private JobPostingRepository jobPostingRepository;
  private JobRepository jobRepository;
  private EmployerRepository employerRepository;
  private CityRepository cityRepository;
  private FromJobPostingDtoToJobPosting converter ;
  private Job job;
  private City city;
  private Employer employer;

  @Autowired
  public JobPostingManager(
      JobPostingRepository jobPostingRepository,
      JobRepository jobRepository,
      EmployerRepository employerRepository,
      CityRepository cityRepository) {
    this.jobPostingRepository = jobPostingRepository;
    this.jobRepository = jobRepository;
    this.employerRepository = employerRepository;
    this.cityRepository = cityRepository;
  }

  @Override
  public Result save(JobPostingDto jobPostingDto) {
    this.job = this.jobRepository.getByTitle(jobPostingDto.getTitle());
    this.city = this.cityRepository.getByCityName(jobPostingDto.getCityName());
    this.employer = this.employerRepository.getByCompanyName(jobPostingDto.getCompanyName());
    converter =new FromJobPostingDtoToJobPosting(this.city, this.employer, this.job);
    JobPosting jobposting =this.converter.convertToEntity(jobPostingDto);
    this.jobPostingRepository.save(jobposting);
    return new SuccessResult("Kayıt başarılı");
  }

  @Override
  public DataResult<List<JobPostingDto>> getAllActiveJobPostings() {
    converter=new FromJobPostingDtoToJobPosting();
    List<JobPosting> jobPostings=this.jobPostingRepository.getAllByIsActiveTrue();
    List<JobPostingDto> jobPostingDtos = (List<JobPostingDto>) this.converter.mapListSourceToDestination(jobPostings);
    return new DataResult<>(jobPostingDtos,true,"veri listelendi!");
  }

  @Override
  public Result updatePassiveJobPostings(int jobId) throws NoDataFoundException {
    JobPosting jobPosting=this.jobPostingRepository.findById(jobId).orElseThrow(()-> new NoDataFoundException("Job posting not found for this id :: "+jobId));
    jobPosting.setIsActive(false);
    this.jobPostingRepository.save(jobPosting);
    return new SuccessResult("işlem başarılı");
  }

  @Override
  public DataResult<List<JobPostingDto>> getAllActiveJobPostingSortedByDate() {
    converter=new FromJobPostingDtoToJobPosting();
    Sort sort= Sort.by(Sort.Direction.ASC,"applicationDeadLine");
    List<JobPosting> jobPostings=this.jobPostingRepository.getAllByIsActiveTrue(sort);
    List<JobPostingDto> jobPostingDtos = (List<JobPostingDto>) this.converter.mapListSourceToDestination(jobPostings);
    return new DataResult<>(jobPostingDtos,true,"veri listelendi!");
  }

  @Override
  public DataResult<List<JobPostingDto>> getAllActiveJobPostingByCompanyName(String companyName) throws NoDataFoundException {
    converter=new FromJobPostingDtoToJobPosting();

    this.employer = this.employerRepository.getByCompanyName(companyName);
    List<JobPosting> jobPostings=this.jobPostingRepository.findAllByIsActiveTrueAndEmployer_Id(this.employer.getId());
           if(jobPostings.isEmpty())
           throw new NoDataFoundException("Veri bulunamadı");


    List<JobPostingDto> jobPostingDtos= (List<JobPostingDto>) converter.mapListSourceToDestination(jobPostings);
    return new DataResult<>(jobPostingDtos,true,"veri listelendi!");
  }
}

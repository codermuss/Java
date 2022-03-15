package com.example.hrms.converter;

import com.example.hrms.core.utilities.results.abstracts.DtoToDtoConverter;
import com.example.hrms.dto.JobPostingDto;
import com.example.hrms.entity.City;
import com.example.hrms.entity.Employer;
import com.example.hrms.entity.Job;
import com.example.hrms.entity.JobPosting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FromJobPostingDtoToJobPosting implements DtoToDtoConverter<JobPostingDto, JobPosting> {

  private City city;
  private Employer employer;
  private Job job;

  @Autowired
  public FromJobPostingDtoToJobPosting(City city, Employer employer, Job job) {
    this.city = city;
    this.employer = employer;
    this.job = job;
  }

  public FromJobPostingDtoToJobPosting() {
  }

  @Override
  public JobPosting convertToEntity(JobPostingDto jobPostingDto) {
    return JobPosting.builder()
        .jobDetails(jobPostingDto.getJobDetails())
        .maxSalary(jobPostingDto.getMaxSalary())
        .minSalary(jobPostingDto.getMinSalary())
        .numberOfVacantPositions(jobPostingDto.getNumberOfVacantPositions())
        .applicationDeadLine(jobPostingDto.getApplicationDeadLine())
        .city(this.city)
        .job(this.job)
        .employer(this.employer)
        .isActive(true)
        .build();
  }

  @Override
  public JobPostingDto convertToDestination(JobPosting jobPosting) {
    return null;
  }

  @Override
  public Collection<JobPostingDto> mapListSourceToDestination(Collection<JobPosting> entityList) {
    List<JobPostingDto> jobPostings=entityList.stream().map(jobPosting -> JobPostingDto.builder()
            .jobDetails(jobPosting.getJobDetails())
            .maxSalary(jobPosting.getMaxSalary())
            .minSalary(jobPosting.getMinSalary())
            .numberOfVacantPositions(jobPosting.getNumberOfVacantPositions())
            .applicationDeadLine(jobPosting.getApplicationDeadLine())
            .cityName(jobPosting.getCity().getCityName())
            .title(jobPosting.getJob().getTitle())
            .companyName(jobPosting.getEmployer().getCompanyName())
            .build()).collect(Collectors.toList());
    return jobPostings;
  }

  @Override
  public Collection<JobPosting> mapListDestinationToEntity(Collection<JobPostingDto> dtoList) {
   return null;
  }
}

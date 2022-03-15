package com.example.hrms.controller;

import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.dto.JobPostingDto;
import com.example.hrms.entity.JobPosting;
import com.example.hrms.handler.NoDataFoundException;
import com.example.hrms.service.abstracts.JobPostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobpostings")
public class JobPostingController {

  private JobPostingService jobPostingService;

  @Autowired
  public JobPostingController(JobPostingService jobPostingService) {
    this.jobPostingService = jobPostingService;
  }

  @PostMapping("/savejobposting")
  public ResponseEntity<Result> saveJobPosting(@RequestBody JobPostingDto jobPosting){
    return new ResponseEntity<>(this.jobPostingService.save(jobPosting), HttpStatus.OK);
  }

  @GetMapping("/getAllActiveJobPosting")
  public ResponseEntity<DataResult<List<JobPostingDto>>> getAllActiveJobPosting(){
    return new ResponseEntity<>(this.jobPostingService.getAllActiveJobPostings(),HttpStatus.OK);
  }

  @PutMapping("/updatePassiveJobPosting")
  public ResponseEntity<Result> updatePassiveJobPosting(@RequestParam int jobId) throws NoDataFoundException {
    return new ResponseEntity<>(this.jobPostingService.updatePassiveJobPostings(jobId),HttpStatus.OK);
  }

  @GetMapping("/getAllActiveJobPostingSortedByDate")
  public ResponseEntity<DataResult<List<JobPostingDto>>> getAllActiveJobPostingSortedByDate(){
    return new ResponseEntity<>(this.jobPostingService.getAllActiveJobPostingSortedByDate(),HttpStatus.OK);
  }

  @GetMapping("/getAllActiveJobPostingByCompanyName")
  public ResponseEntity<DataResult<List<JobPostingDto>>> getAllActiveJobPostingByCompanyName(@RequestParam String companyName) throws NoDataFoundException {
    return new ResponseEntity<>(this.jobPostingService.getAllActiveJobPostingByCompanyName(companyName),HttpStatus.OK);
  }
}

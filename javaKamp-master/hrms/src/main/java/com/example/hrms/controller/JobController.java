package com.example.hrms.controller;

import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.entity.Job;
import com.example.hrms.handler.JobTitleIsAlreadyException;
import com.example.hrms.handler.NoDataFoundException;
import com.example.hrms.service.abstracts.JobService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/** Job Controller için kullanılmıstır. */
@RestController
@RequestMapping("/job")
public class JobController {

  private final JobService service;

  @Autowired
  public JobController(JobService service) {
    this.service = service;
  }

  @GetMapping("/getAll")
  public ResponseEntity<DataResult<List<Job>>> getAllJob() {
    return new ResponseEntity<>(service.getAllJob(), HttpStatus.OK);
  }

  @GetMapping("/getJob/{id}")
  public ResponseEntity<DataResult<Optional<Job>>> getJobId(@PathVariable Integer id) throws NoDataFoundException {
    return new ResponseEntity<>(service.getJobId(id), HttpStatus.OK);
  }

  @PostMapping("/saveJob")
  public ResponseEntity<Result> saveJob(@Valid @RequestBody Job job) throws JobTitleIsAlreadyException {
    return new ResponseEntity<>(service.save(job), HttpStatus.OK);
  }
}

package com.example.hrms.controller;

import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.dto.CandidateDto;
import com.example.hrms.entity.Candidate;
import com.example.hrms.service.abstracts.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

  private CandidateService candidateService;

  @Autowired
  public CandidateController(CandidateService candidateService) {
    this.candidateService = candidateService;
  }

  @PostMapping("/savecandidate")
   public ResponseEntity<Result> saveCandidate(@Valid @RequestBody CandidateDto candidateDto)
      throws Exception {
    return new ResponseEntity<>(this.candidateService.save(candidateDto), HttpStatus.OK);
  }

  @GetMapping("/getallcandidates")
    public ResponseEntity<DataResult<List<CandidateDto>>> getAllCandidates(){
      return new ResponseEntity<>(this.candidateService.getAllCandidates(), HttpStatus.OK);
  }
}

package com.example.hrms.controller;

import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.dto.EmployerDto;
import com.example.hrms.entity.Employer;
import com.example.hrms.handler.EmailCheckException;
import com.example.hrms.handler.EmailIsAlreadyException;
import com.example.hrms.handler.EmailIsNotCompatibleWebSiteException;
import com.example.hrms.handler.HrmsCheckException;
import com.example.hrms.service.abstracts.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employer")
public class EmployerController {

    private EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @PostMapping("/saveEmployer")
    public ResponseEntity<Result> saveEmployer(@Valid @RequestBody(required = true) EmployerDto employer) throws EmailIsNotCompatibleWebSiteException, EmailIsAlreadyException, HrmsCheckException, EmailCheckException {

        return new ResponseEntity<>(this.employerService.save(employer), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<DataResult<List<EmployerDto>>> getAllEmployers(){
        return new ResponseEntity<>(this.employerService.getAllEmployers(),HttpStatus.OK);
    }
}

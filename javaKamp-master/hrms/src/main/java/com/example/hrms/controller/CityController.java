package com.example.hrms.controller;

import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.dto.CityDto;
import com.example.hrms.service.abstracts.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    private CityService service;

    @Autowired
    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public ResponseEntity<DataResult<List<CityDto>>> getAll(){
        return new ResponseEntity<>(this.service.getAllCity(), HttpStatus.OK);
    }
}

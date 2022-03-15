package com.example.hrms.service.abstracts;

import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.dto.CityDto;

import java.util.List;

public interface CityService {
    public DataResult<List<CityDto>> getAllCity();
}

package com.example.hrms.service.concretes;

import com.example.hrms.converter.FromCityDtoToCity;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.dto.CityDto;
import com.example.hrms.entity.City;
import com.example.hrms.repository.abstracts.CityRepository;
import com.example.hrms.service.abstracts.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityManager implements CityService {

  private CityRepository repository;
  private List<City> cities;
  private FromCityDtoToCity converter;
  private List<CityDto> cityDtos;

  @Autowired
  public CityManager(CityRepository repository,FromCityDtoToCity converter) {
    this.repository = repository;
    this.converter=converter;
  }
  @Override
  public DataResult<List<CityDto>> getAllCity() {

    cities=this.repository.findAll();

    cityDtos= (List<CityDto>) converter.mapListSourceToDestination(cities);

    return new DataResult<>(cityDtos,true,"basariyla listelendi");
  }
}

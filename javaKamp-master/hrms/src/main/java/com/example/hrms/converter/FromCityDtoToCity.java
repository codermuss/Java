package com.example.hrms.converter;

import com.example.hrms.core.utilities.results.abstracts.DtoToDtoConverter;
import com.example.hrms.dto.CityDto;
import com.example.hrms.entity.City;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

@Component
public class FromCityDtoToCity implements DtoToDtoConverter<CityDto, City> {
  City city;
  CityDto cityDto;

  @Override
  public City convertToEntity(CityDto cityDto) {
    return null;
  }

  @Override
  public CityDto convertToDestination(City city) {
    cityDto = new CityDto(city.getCityName());
    return cityDto;
  }

  @Override
  public Collection<CityDto> mapListSourceToDestination(Collection<City> entityList) {
    Collection<CityDto> cityDtos=entityList.stream().map(city-> new CityDto(city.getCityName())).collect(Collectors.toList());
    return cityDtos;
  }

  @Override
  public Collection<City> mapListDestinationToEntity(Collection<CityDto> dtoList) {
    Collection<City> city=dtoList.stream().map(cityDto->new City(cityDto.getCityName())).collect(Collectors.toList());
    return city;
  }
}

package com.example.hrms.converter;

import com.example.hrms.core.utilities.results.abstracts.DtoToDtoConverter;
import com.example.hrms.dto.EmployerDto;
import com.example.hrms.entity.Employer;
import org.springframework.core.convert.converter.Converter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FromEmployerDtoToEmployer implements DtoToDtoConverter<EmployerDto, Employer> {
  Employer employer;
  EmployerDto employerDto;

  @Override
  public Employer convertToEntity(EmployerDto employerDto) {
    employer =
        new Employer(
            employerDto.getEmail(),
            employerDto.getPassword(),
            employerDto.getPasswordAgain(),
            employerDto.getWebSite(),
            employerDto.getPhoneNumber(),
            employerDto.getCompanyName());
    return employer;
  }

  @Override
  public EmployerDto convertToDestination(Employer employer) {
    employerDto =
        new EmployerDto(
            employer.getWebSite(),
            employer.getPhoneNumber(),
            employer.getCompanyName(),
            employer.getEmail());
    return employerDto;
  }

  @Override
  public Collection<EmployerDto> mapListSourceToDestination(Collection<Employer> entityList) {
    List<EmployerDto> employerDtos=entityList.stream().map(emp-> new EmployerDto(emp.getWebSite(),emp.getPhoneNumber(),emp.getCompanyName(),emp.getEmail())).collect(Collectors.toList());
    return employerDtos;
  }

  @Override
  public Collection<Employer> mapListDestinationToEntity(Collection<EmployerDto> dtoList) {
    return null;
  }
}

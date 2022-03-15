package com.example.hrms.service.concretes;

import com.example.hrms.converter.FromEmployerDtoToEmployer;
import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.core.utilities.results.concretes.SuccessResult;
import com.example.hrms.dto.EmployerDto;
import com.example.hrms.entity.Employer;
import com.example.hrms.handler.EmailCheckException;
import com.example.hrms.handler.EmailIsAlreadyException;
import com.example.hrms.handler.EmailIsNotCompatibleWebSiteException;
import com.example.hrms.handler.HrmsCheckException;
import com.example.hrms.repository.abstracts.EmployerRepository;
import com.example.hrms.service.abstracts.EmployerService;
import com.example.hrms.verification.abstracts.EmailCheckService;
import com.example.hrms.verification.abstracts.HrmsCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployerManager implements EmployerService {

  private EmployerRepository employerRepository;
  private EmailCheckService emailCheckService;
  private HrmsCheckService hrmsCheckService;
  private FromEmployerDtoToEmployer converter;

  @Autowired
  public EmployerManager(
      EmployerRepository employerRepository,
      EmailCheckService emailCheckService,
      HrmsCheckService hrmsCheckService) {
    this.employerRepository = employerRepository;
    this.emailCheckService = emailCheckService;
    this.hrmsCheckService = hrmsCheckService;
  }

  @Override
  public Result save(EmployerDto employerDto)
      throws EmailIsNotCompatibleWebSiteException, EmailIsAlreadyException, EmailCheckException,
          HrmsCheckException {
    String[] emailsStrings = employerDto.getEmail().split("[@._]");
    String[] webSiteStrings = employerDto.getWebSite().split("[._]");
    converter = new FromEmployerDtoToEmployer();
    Employer employer = converter.convertToEntity(employerDto);
    if (!emailsStrings[1].equals(webSiteStrings[1])) {
      throw new EmailIsNotCompatibleWebSiteException(
          "Girilen emial adresi domain ile ilişkili değildir!");
    } else if (this.existsByEmail(employer.getEmail())) {
      throw new EmailIsAlreadyException("Girmiş olduğunuz email adresi sistemde kayıtlıdır.");
    } else if (!this.emailCheckService.CheckIfRealEmail(employer)) {
      throw new EmailCheckException("email doğrulaması yapılmamıştır!");
    } else if (!this.hrmsCheckService.checkIfConfirmHrms(employer)) {
      throw new HrmsCheckException("Hrms personeli onaylamadı!");
    } else {

      this.employerRepository.save(employer);
      return new SuccessResult("Kayıt başarılı");
    }
  }

  @Override
  public boolean existsByEmail(String email) {
    return this.employerRepository.existsByEmail(email);
  }

  @Override
  public DataResult<List<EmployerDto>> getAllEmployers() {
    converter = new FromEmployerDtoToEmployer();
    List<Employer> employers = this.employerRepository.findAll();
    List<EmployerDto> employerDtos =
        (List<EmployerDto>) converter.mapListSourceToDestination(employers);

    return new DataResult<>(employerDtos, true, "basariyla listelendi");
  }
}

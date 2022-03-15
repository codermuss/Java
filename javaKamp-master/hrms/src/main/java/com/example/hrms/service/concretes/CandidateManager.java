package com.example.hrms.service.concretes;

import com.example.hrms.converter.CandidateDtoToCandidate;
import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.core.utilities.results.concretes.SuccessResult;
import com.example.hrms.dto.CandidateDto;
import com.example.hrms.entity.Candidate;
import com.example.hrms.handler.EmailCheckException;
import com.example.hrms.handler.EmailIsAlreadyException;
import com.example.hrms.handler.IdentityNoIsAlreadyException;
import com.example.hrms.handler.MernisCheckException;
import com.example.hrms.repository.abstracts.CandidateRepository;
import com.example.hrms.service.abstracts.CandidateService;
import com.example.hrms.verification.abstracts.EmailCheckService;
import com.example.hrms.verification.abstracts.MernisCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {


  private final CandidateRepository candidateRepository;
  private MernisCheckService mernisCheckService;
  private EmailCheckService emailCheckService;
  private CandidateDtoToCandidate converter;

  @Autowired
  public CandidateManager(
      CandidateRepository candidateRepository,
      MernisCheckService mernisCheckService,
      EmailCheckService emailCheckService) {
    this.candidateRepository = candidateRepository;
    this.mernisCheckService = mernisCheckService;
    this.emailCheckService = emailCheckService;
    this.converter=new CandidateDtoToCandidate();
  }

  @Override
  public Result save(CandidateDto candidateDto)
      throws IdentityNoIsAlreadyException, EmailIsAlreadyException, EmailCheckException,
          MernisCheckException {

    Candidate candidate=converter.convertToEntity(candidateDto);
    boolean hasIsEmail = this.existsByEmail(candidateDto.getEmail());
    boolean hasIsIdentityNumber = this.existsByIdentityNumber(candidateDto.getIdentityNumber());
    if (hasIsEmail) {
      throw new EmailIsAlreadyException("Girmiş olduğunuz email adresi sistemde kayıtlıdır.");
    } else if (hasIsIdentityNumber) {
      throw new IdentityNoIsAlreadyException("Girmiş olduğunuz TC no sistemde kayıtlıdır.");
    } else if (!this.mernisCheckService.checkIfRealPerson(candidate)) {
      throw new MernisCheckException("Girmiş olduğunuz kişi mernis sisteminde kayıtlı değildir.");
    } else if (!this.emailCheckService.CheckIfRealEmail(candidate)) {
      throw new EmailCheckException("email doğrulaması yapılmamıştır!.");
    } else {
      this.candidateRepository.save(candidate);
      return new SuccessResult("Kayıt başarılı");
    }
  }

  @Override
  public boolean existsByEmail(String email) {
    return this.candidateRepository.existsByEmail(email);
  }

  @Override
  public boolean existsByIdentityNumber(String identityNumber) {
    return this.candidateRepository.existsByIdentityNumber(identityNumber);
  }

  @Override
  public DataResult<List<CandidateDto>> getAllCandidates() {
    List<Candidate> candidates=this.candidateRepository.findAll();
    List<CandidateDto> candidatesDto= (List<CandidateDto>) converter.mapListSourceToDestination(candidates);

    return new DataResult<>(candidatesDto, true, "basarıyla listelendi");
  }
}

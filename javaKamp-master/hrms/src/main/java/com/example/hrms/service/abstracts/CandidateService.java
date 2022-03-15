package com.example.hrms.service.abstracts;

import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.dto.CandidateDto;
import com.example.hrms.entity.Candidate;
import com.example.hrms.handler.*;

import java.util.List;

public interface CandidateService {
    Result save(CandidateDto candidateDto) throws EmailIsNotCompatibleWebSiteException, EmailIsAlreadyException, EmailCheckException, HrmsCheckException, MernisCheckException, IdentityNoIsAlreadyException;
    boolean existsByEmail(String email);
    boolean existsByIdentityNumber(String identityNumber);
    DataResult<List<CandidateDto>> getAllCandidates();
}

package com.example.hrms.service.abstracts;

import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.dto.EmployerDto;
import com.example.hrms.entity.Employer;
import com.example.hrms.handler.EmailCheckException;
import com.example.hrms.handler.EmailIsAlreadyException;
import com.example.hrms.handler.EmailIsNotCompatibleWebSiteException;
import com.example.hrms.handler.HrmsCheckException;

import java.util.List;

public interface EmployerService {
    public Result save(EmployerDto employer) throws EmailIsNotCompatibleWebSiteException, EmailIsAlreadyException, EmailCheckException, HrmsCheckException;
    public boolean existsByEmail(String email);
    public DataResult<List<EmployerDto>> getAllEmployers();
}

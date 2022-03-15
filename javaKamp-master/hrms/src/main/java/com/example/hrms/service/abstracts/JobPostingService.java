package com.example.hrms.service.abstracts;

import com.example.hrms.core.utilities.results.abstracts.Result;
import com.example.hrms.core.utilities.results.concretes.DataResult;
import com.example.hrms.dto.JobPostingDto;
import com.example.hrms.entity.JobPosting;
import com.example.hrms.handler.NoDataFoundException;

import java.util.List;

public interface JobPostingService {

    public Result save(JobPostingDto jobPosting);

    public DataResult<List<JobPostingDto>> getAllActiveJobPostings();

    public Result updatePassiveJobPostings(int jobId) throws NoDataFoundException;

    public DataResult<List<JobPostingDto>>   getAllActiveJobPostingSortedByDate();

    public DataResult<List<JobPostingDto>>  getAllActiveJobPostingByCompanyName(String companyName) throws NoDataFoundException;
}

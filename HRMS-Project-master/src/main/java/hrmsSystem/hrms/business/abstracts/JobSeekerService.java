package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.JobSeekers;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeekers>> getAll();
    Result add(JobSeekers jobSeekers);
    DataResult<List<JobSeekers>> getJobSeekerByUserId(int userId);
}

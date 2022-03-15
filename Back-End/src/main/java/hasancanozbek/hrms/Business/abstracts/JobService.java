package hasancanozbek.hrms.Business.abstracts;

import hasancanozbek.hrms.Core.utilities.results.DataResult;
import hasancanozbek.hrms.Core.utilities.results.Result;
import hasancanozbek.hrms.Entities.concretes.Job;

import java.util.List;

public interface JobService {

    DataResult<List<Job>> getJobs();

    Result addJob(Job job);
}

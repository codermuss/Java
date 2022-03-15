package hasancanozbek.hrms.Business.concretes;

import hasancanozbek.hrms.Business.abstracts.JobService;
import hasancanozbek.hrms.Core.utilities.results.DataResult;
import hasancanozbek.hrms.Core.utilities.results.Result;
import hasancanozbek.hrms.Core.utilities.results.SuccessDataResult;
import hasancanozbek.hrms.Core.utilities.results.SuccessResult;
import hasancanozbek.hrms.DataAccess.abstracts.JobDao;
import hasancanozbek.hrms.Entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDao jobDao;
    @Autowired
    public JobManager(JobDao jobDao){
        this.jobDao = jobDao;
    }

    @Override
    public DataResult<List<Job>> getJobs() {
        return new SuccessDataResult<>(jobDao.findAll(), "İş pozisyonları listelendi");
    }

    @Override
    public Result addJob(Job job) {
        jobDao.save(job);
        return new SuccessResult("Yeni iş pozisyonu eklendi");
    }
}

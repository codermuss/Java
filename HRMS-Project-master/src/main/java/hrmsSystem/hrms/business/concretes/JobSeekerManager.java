package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.JobSeekerService;
import hrmsSystem.hrms.core.utilities.adapters.abstracts.NationIdControllService;
import hrmsSystem.hrms.core.utilities.adapters.concretes.EmailAuthManager;
import hrmsSystem.hrms.core.utilities.adapters.concretes.MernisControlAdapter;
import hrmsSystem.hrms.core.utilities.adapters.concretes.ValidationCodeGenerator;
import hrmsSystem.hrms.core.utilities.results.*;
import hrmsSystem.hrms.dataAccess.abstracts.JobSeekerDao;
import hrmsSystem.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {
    private JobSeekerDao jobSeekerDao;
    private NationIdControllService nationIdControllService= new MernisControlAdapter();

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao){
        super();
        this.jobSeekerDao=jobSeekerDao;
    }

    @Override
    public DataResult<List<JobSeekers>> getAll() {
        return new SuccessDataResult<List<JobSeekers>>(this.jobSeekerDao.findAll(),"Data has listed!");
    }

    @Override
    public Result add(JobSeekers jobSeekers) {

        if(EmailAuthManager.Auth(jobSeekers, ValidationCodeGenerator.generete()) &&
                nationIdControllService.controll(jobSeekers.getNationalIdd())){
            this.jobSeekerDao.save(jobSeekers);
        }

        return new SuccessResult("Job Seeker has added");
    }

    @Override
    public DataResult<List<JobSeekers>> getJobSeekerByUserId(int userId) {
        return new SuccessDataResult<List<JobSeekers>>(this.jobSeekerDao.findJobSeekersById(userId));
    }
}

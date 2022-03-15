package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.ResumeService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.ResumeDao;
import hrmsSystem.hrms.entities.concretes.Resume;
import hrmsSystem.hrms.entities.dtos.ResumeWithAllInformationsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeManager implements ResumeService {
    private ResumeDao resumeDao;

    @Autowired
    public ResumeManager(ResumeDao resumeDao) {
        this.resumeDao = resumeDao;
    }


    @Override
    public DataResult<List<Resume>> getAll() {
        return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll());
    }

    @Override
    public Result add(Resume resume) {
        this.resumeDao.save(resume);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Resume>> getResumeByJobSeekerId(int jobSeekerId) {
        return new SuccessDataResult<List<Resume>>(this.resumeDao.findResumeByJobSeekers_Id(jobSeekerId));
    }

    @Override
    public DataResult<List<ResumeWithAllInformationsDto>> getResumeWithAllInformations(int jobSeekerId) {
        return new SuccessDataResult<List<ResumeWithAllInformationsDto>>(this.resumeDao.getResumesByJobSeekers_Id(jobSeekerId));
    }
}

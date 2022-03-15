package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.EducationService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.EducationDao;
import hrmsSystem.hrms.entities.concretes.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationManager implements EducationService {
    private EducationDao educationDao;

    @Autowired
    public EducationManager(EducationDao educationDao) {
        this.educationDao = educationDao;
    }

    @Override
    public DataResult<List<Education>> getAll() {
        return new SuccessDataResult<List<Education>>(this.educationDao.findAll());
    }

    @Override
    public Result add(Education education) {
        this.educationDao.save(education);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Education>> getEducationWithResumeId(int resumeId) {

        return new SuccessDataResult<List<Education>>(this.educationDao.findEducationByResume_ResumeId(resumeId));
    }
}

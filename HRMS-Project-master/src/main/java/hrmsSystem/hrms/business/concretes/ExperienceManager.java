package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.ExperienceService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.ExperiencesDao;
import hrmsSystem.hrms.entities.concretes.Experiences;
import hrmsSystem.hrms.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceManager implements ExperienceService {

    private ExperiencesDao experiencesDao;

    @Autowired
    public ExperienceManager(ExperiencesDao experiencesDao) {
        this.experiencesDao = experiencesDao;
    }

    @Override
    public DataResult<List<Experiences>> getAll() {
        return new SuccessDataResult<List<Experiences>>(this.experiencesDao.findAll());
    }

    @Override
    public Result add(Experiences experiences) {
        experiences.setExperinceYear(experiences.getQuitYear()-experiences.getStartYear());
        this.experiencesDao.save(experiences);
        return new SuccessResult("Languages has been added");
    }

    @Override
    public DataResult<List<Experiences>> getByResumeId(int resumeId) {
        return new SuccessDataResult<List<Experiences>>(this.experiencesDao.findExperiencesByResume_ResumeId(resumeId));
    }
}

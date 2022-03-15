package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.SkillsService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.SkillsDao;
import hrmsSystem.hrms.entities.concretes.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsManager implements SkillsService {
    private SkillsDao skillsDao;

    @Autowired
    public SkillsManager(SkillsDao skillsDao) {
        this.skillsDao = skillsDao;
    }

    @Override
    public DataResult<List<Skills>> getAll() {

        return new SuccessDataResult<List<Skills>>(this.skillsDao.findAll(),"Success");
    }

    @Override
    public Result add(Skills skills) {
        this.skillsDao.save(skills);
        return new SuccessResult("Skill has added");
    }

    @Override
    public DataResult<List<Skills>> getSkillsByResumeId(int resumeId) {
        return new SuccessDataResult<List<Skills>>(this.skillsDao.findSkillsByResume_ResumeId(resumeId),"Skill has been added");
    }
}

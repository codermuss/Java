package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.LanguagesService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.LanguagesDao;
import hrmsSystem.hrms.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguagesService {
    private LanguagesDao languagesDao;

    @Autowired
    public LanguageManager(LanguagesDao languagesDao) {
        this.languagesDao = languagesDao;
    }

    @Override
    public DataResult<List<Languages>> getAll() {
        return new SuccessDataResult<List<Languages>>(this.languagesDao.findAll());
    }

    @Override
    public Result add(Languages languages) {
        this.languagesDao.save(languages);
        return new SuccessResult("Languages has been added");
    }

    @Override
    public DataResult<List<Languages>> getLanguageByResumeId(int resumeId) {
       return new SuccessDataResult<List<Languages>>(this.languagesDao.findLanguagesByResume_ResumeId(resumeId));
    }
}

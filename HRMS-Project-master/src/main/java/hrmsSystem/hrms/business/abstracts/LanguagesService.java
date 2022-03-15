package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Languages;

import java.util.List;

public interface LanguagesService {
    DataResult<List<Languages>> getAll();
    Result add(Languages languages);
    DataResult<List<Languages>> getLanguageByResumeId(int resumeId);

}

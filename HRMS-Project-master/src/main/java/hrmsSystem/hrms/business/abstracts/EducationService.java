package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Education;

import java.util.List;

public interface EducationService {
    DataResult<List<Education>> getAll();
    Result add(Education education);

    DataResult<List<Education>> getEducationWithResumeId(int resumeId);
}

package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Experiences;

import java.util.List;

public interface ExperienceService {
    DataResult<List<Experiences>> getAll();
    Result add(Experiences experiences);
    DataResult<List<Experiences>> getByResumeId(int resumeId);
}

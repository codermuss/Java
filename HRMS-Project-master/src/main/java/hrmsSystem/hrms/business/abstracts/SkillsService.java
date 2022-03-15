package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Skills;

import java.util.List;

public interface SkillsService {
    DataResult<List<Skills>> getAll();
    Result add(Skills skills);
    DataResult<List<Skills>> getSkillsByResumeId(int resumeId);
}

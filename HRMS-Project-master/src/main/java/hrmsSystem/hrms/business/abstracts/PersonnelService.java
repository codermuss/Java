package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

public interface PersonnelService {
    DataResult<List<SystemPersonnel>> getAll();
    Result add(SystemPersonnel systemPersonnel);
}

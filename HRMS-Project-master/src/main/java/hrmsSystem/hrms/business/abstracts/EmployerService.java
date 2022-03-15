package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Employers;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employers>> getAll();

    Result add(Employers employers);
}

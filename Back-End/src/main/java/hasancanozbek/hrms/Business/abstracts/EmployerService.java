package hasancanozbek.hrms.Business.abstracts;

import hasancanozbek.hrms.Core.utilities.results.DataResult;
import hasancanozbek.hrms.Core.utilities.results.Result;
import hasancanozbek.hrms.Entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    DataResult<List<Employer>> getEmployers();

    Result addEmployer(Employer employer);
}

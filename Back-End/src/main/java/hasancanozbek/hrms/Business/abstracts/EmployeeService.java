package hasancanozbek.hrms.Business.abstracts;

import hasancanozbek.hrms.Core.utilities.results.DataResult;
import hasancanozbek.hrms.Core.utilities.results.Result;
import hasancanozbek.hrms.Entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    DataResult<List<Employee>> getEmployees();

    Result addEmployee(Employee employee);
}

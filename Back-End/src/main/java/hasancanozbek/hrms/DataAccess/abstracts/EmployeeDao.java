package hasancanozbek.hrms.DataAccess.abstracts;

import hasancanozbek.hrms.Entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

}

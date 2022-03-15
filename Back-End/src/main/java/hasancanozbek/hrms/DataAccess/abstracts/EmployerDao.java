package hasancanozbek.hrms.DataAccess.abstracts;

import hasancanozbek.hrms.Entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
}

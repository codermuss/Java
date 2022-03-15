package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.Employers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employers,Integer> {
}

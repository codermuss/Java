package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.EmployerApproval;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerApprovalDao extends JpaRepository<EmployerApproval,Integer> {
}

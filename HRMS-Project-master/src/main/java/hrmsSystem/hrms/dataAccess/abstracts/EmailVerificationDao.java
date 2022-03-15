package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.EmailVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailVerificationDao extends JpaRepository<EmailVerification,Integer> {
}

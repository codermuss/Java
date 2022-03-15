package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<Users,Integer> {
}

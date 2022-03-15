package hasancanozbek.hrms.DataAccess.abstracts;

import hasancanozbek.hrms.Entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Job,Integer> {

}

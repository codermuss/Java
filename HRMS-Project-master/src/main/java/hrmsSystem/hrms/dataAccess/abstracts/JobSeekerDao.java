package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.JobSeekers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobSeekerDao extends JpaRepository<JobSeekers,Integer> {

    @Query("from JobSeekers j where j.id=:userId")
    List<JobSeekers> findJobSeekersById(int userId);
}

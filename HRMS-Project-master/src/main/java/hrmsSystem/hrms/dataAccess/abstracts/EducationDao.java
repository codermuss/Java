package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EducationDao extends JpaRepository<Education,Integer> {

    @Query("from Education e where e.resume.resumeId=:resumeId")
    List<Education> findEducationByResume_ResumeId(int resumeId);
}

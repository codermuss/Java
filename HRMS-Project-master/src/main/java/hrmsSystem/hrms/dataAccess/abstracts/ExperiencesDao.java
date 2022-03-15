package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.Experiences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExperiencesDao extends JpaRepository<Experiences, Integer> {

    @Query("from Experiences e where e.resume.resumeId=:resumeId")
    List<Experiences> findExperiencesByResume_ResumeId(int resumeId);
}

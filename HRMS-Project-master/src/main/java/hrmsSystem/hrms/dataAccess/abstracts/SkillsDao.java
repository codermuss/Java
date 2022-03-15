package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.entities.concretes.Languages;
import hrmsSystem.hrms.entities.concretes.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SkillsDao extends JpaRepository<Skills,Integer> {

    @Query("from Skills s where s.resume.resumeId=:resumeId")
    List<Skills> findSkillsByResume_ResumeId(int resumeId);

}

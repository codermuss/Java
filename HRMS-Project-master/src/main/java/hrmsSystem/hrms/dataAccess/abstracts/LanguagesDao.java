package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.Languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LanguagesDao extends JpaRepository<Languages, Integer> {

    @Query("from Languages l where l.resume.resumeId=:resumeId")
    List<Languages> findLanguagesByResume_ResumeId(int resumeId);
}

package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.entities.concretes.Resume;
import hrmsSystem.hrms.entities.dtos.ResumeWithAllInformationsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResumeDao extends JpaRepository<Resume,Integer> {

    @Query("from Resume r where r.jobSeekers.id=:seekerId")
    List<Resume> findResumeByJobSeekers_Id(int seekerId);

    @Query("select new hrmsSystem.hrms.entities.dtos.ResumeWithAllInformationsDto" +
            "(r.resumeId,r.jobSeekers.id,r.gitHubAddress,r.linkedinAddress,r.coverLetter,e.workplace,e.position,e.startYear,e.quitYear,e.experinceYear,e.isContinues," +
            "ed.schoolName,ed.department,ed.startYear,ed.graduateYear,ed.isContinues,l.language,l.languageLevel," +
            "s.skillName,s.skillLevel) from Resume r " +
            "inner join r.experiences e inner join r.educations ed inner join r.languages l inner join r.skills s where r.jobSeekers.id=:jobSeekerId")
    List<ResumeWithAllInformationsDto> getResumesByJobSeekers_Id(int jobSeekerId);



}

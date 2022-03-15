package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.business.abstracts.JobAdvertisementService;
import hrmsSystem.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

    @Query("From JobAdvertisement where isActive=true ")
    List<JobAdvertisement> getByLastDateAndIsActive(Sort sort);


}

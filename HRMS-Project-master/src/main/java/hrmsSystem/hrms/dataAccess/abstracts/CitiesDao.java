package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitiesDao extends JpaRepository<Cities,Integer> {
    //List<Cities> getCitie();
}

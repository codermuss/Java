package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.ActivePositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDao extends JpaRepository<ActivePositions,Integer> {
}

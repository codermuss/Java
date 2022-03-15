package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.ActivePositions;

import java.util.List;

public interface PositionService {
    DataResult<List<ActivePositions>> getAll();
    Result add(ActivePositions activePositions);
}

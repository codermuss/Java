package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.PositionService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.PositionDao;
import hrmsSystem.hrms.entities.concretes.ActivePositions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionService {
    private PositionDao positionDao;

    public PositionManager(PositionDao positionDao) {
        this.positionDao=positionDao;
    }


    @Override
    public DataResult<List<ActivePositions>> getAll() {
        return new SuccessDataResult<List<ActivePositions>>(this.positionDao.findAll(),"Data has listed");
    }

    @Override
    public Result add(ActivePositions activePosition) {
        this.positionDao.save(activePosition);
        return new SuccessResult("A job position has added");
    }
}

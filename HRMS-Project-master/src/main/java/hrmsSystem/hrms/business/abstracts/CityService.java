package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.entities.concretes.Cities;

import java.util.List;

public interface CityService {
    DataResult<List<Cities>> getAll();
}

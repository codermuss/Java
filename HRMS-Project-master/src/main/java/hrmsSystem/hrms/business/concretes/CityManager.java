package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.CityService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.CitiesDao;
import hrmsSystem.hrms.entities.concretes.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {
    private CitiesDao citiesDao;

    @Autowired
    public CityManager(CitiesDao citiesDao) {
        this.citiesDao = citiesDao;
    }

    @Override
    public DataResult<List<Cities>> getAll() {
        return new SuccessDataResult<List<Cities>>(citiesDao.findAll());
    }
}

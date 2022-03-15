package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Results.DataResult;
import kodlamaio.hrms.core.utilities.Results.Result;
import kodlamaio.hrms.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
	DataResult<City> getById(int id);
	Result add(City city);
	Result update(City city);
	Result delete(int id);
}

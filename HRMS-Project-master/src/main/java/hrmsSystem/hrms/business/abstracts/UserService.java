package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.entities.concretes.Users;

import java.util.List;

public interface UserService {
    DataResult<List<Users>> getAll();

}

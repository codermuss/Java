package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.PersonnelService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.PersonnelDao;
import hrmsSystem.hrms.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonnelManager implements PersonnelService {
    private PersonnelDao personnelDao;

    @Autowired
    public PersonnelManager(PersonnelDao personnelDao) {
        this.personnelDao = personnelDao;
    }

    @Override
    public DataResult<List<SystemPersonnel>> getAll() {
        return new SuccessDataResult<List<SystemPersonnel>>(this.personnelDao.findAll(), "Data has listed");
    }

    @Override
    public Result add(SystemPersonnel systemPersonnel) {

        this.personnelDao.save(systemPersonnel);
        return new SuccessResult("A system personnel has added");
    }

    public Optional<SystemPersonnel> getPersonnel(){
        return this.personnelDao.findById(1);
    }
}

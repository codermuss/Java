package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.UserService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.dataAccess.abstracts.UserDao;
//import hrmsSystem.hrms.entities.concretes.Users;
import hrmsSystem.hrms.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public DataResult<List<Users>> getAll() {
        return new SuccessDataResult<>(this.userDao.findAll(),"Data has listed");


    }
}

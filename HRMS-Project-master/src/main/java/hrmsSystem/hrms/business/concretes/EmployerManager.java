package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.EmployerApprovalService;
import hrmsSystem.hrms.business.abstracts.EmployerService;
import hrmsSystem.hrms.core.utilities.adapters.concretes.EmailAuthManager;
import hrmsSystem.hrms.core.utilities.adapters.concretes.ValidationCodeGenerator;
import hrmsSystem.hrms.core.utilities.results.*;
import hrmsSystem.hrms.dataAccess.abstracts.EmployerDao;
import hrmsSystem.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;
    private EmployerApprovalService employerApprovalService;


    @Autowired
    public EmployerManager(EmployerDao employerDao,EmployerApprovalService employerApprovalService){
        this.employerDao=employerDao;
        this.employerApprovalService=employerApprovalService;
    }

    @Override
    public DataResult<List<Employers>> getAll() {
        return new SuccessDataResult<List<Employers>>(this.employerDao.findAll(),"Employers Data has listed");
    }

    @Override
    public Result add(Employers employers) {
        if(EmailAuthManager.Auth(employers, ValidationCodeGenerator.generete())
                && employerApprovalService.process(employers)){
            this.employerDao.save(employers);
        }
        return new SuccessResult("An employer has added");
    }
}

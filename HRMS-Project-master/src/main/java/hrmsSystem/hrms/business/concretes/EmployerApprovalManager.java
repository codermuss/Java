package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.EmployerApprovalService;
import hrmsSystem.hrms.entities.concretes.EmployerApproval;
import hrmsSystem.hrms.entities.concretes.Employers;
import hrmsSystem.hrms.entities.concretes.SystemPersonnel;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.dataAccess.abstracts.EmployerApprovalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerApprovalManager implements EmployerApprovalService {
    private EmployerApprovalDao employerApprovalDao;
    private EmployerApproval employerApproval;
    private PersonnelManager personnelManager;

    @Autowired
    public EmployerApprovalManager(EmployerApprovalDao employerApprovalDao) {
        this.employerApprovalDao = employerApprovalDao;
        //this.systemPersonnel=systemPersonnel;
    }

    @Override
    public boolean process(Employers employers) {
        //Bu işlem için database'den rast gele bir personel seçilecek
        SystemPersonnel systemPersonnel = new SystemPersonnel("Mert","Tuğrul");
        employerApproval = new EmployerApproval();
        employerApproval.setCompanyName(employers.getCompanyName());
        employerApproval.setPersonnelName(systemPersonnel.getFirstName()+" "+systemPersonnel.getLastName());
        employerApproval.setDate("06/06/2021");
        employerApproval.setProcessResult(true);
        this.employerApprovalDao.save(this.employerApproval);

        return true;
    }

    @Override
    public DataResult<List<EmployerApproval>> getAll() {
        return new SuccessDataResult<List<EmployerApproval>>(this.employerApprovalDao.findAll(),"Data has listed");
    }
}

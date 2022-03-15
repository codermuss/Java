package hasancanozbek.hrms.Business.concretes;

import hasancanozbek.hrms.Business.abstracts.EmployerService;
import hasancanozbek.hrms.Core.ValidationServices.MailVerification.MailValidationService;
import hasancanozbek.hrms.Core.utilities.results.*;
import hasancanozbek.hrms.DataAccess.abstracts.EmployerDao;
import hasancanozbek.hrms.Entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    private MailValidationService mailValidationService;

    @Autowired
    public EmployerManager(EmployerDao employerDao, MailValidationService mailValidationService) {
        this.employerDao = employerDao;
        this.mailValidationService = mailValidationService;
    }

    @Override
    public DataResult<List<Employer>> getEmployers() {
        return new SuccessDataResult<>(employerDao.findAll(), "İşverenler listelendi");
    }

    @Override
    public Result addEmployer(Employer employer) {
        if (mailValidationService.isRealEmail(employer.getEmail())) {
            employerDao.save(employer);
            return new SuccessResult("Yeni işveren eklendi");
        }
        else{
            return new ErrorResult("Mail doğrulanamadı");
        }
    }
}
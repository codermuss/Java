package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.EmailVerificationService;
import hrmsSystem.hrms.core.utilities.results.*;
import hrmsSystem.hrms.dataAccess.abstracts.EmailVerificationDao;
import hrmsSystem.hrms.entities.concretes.EmailVerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailVerificationManager implements EmailVerificationService {
    private EmailVerificationDao emailVerificationDao;


    @Autowired
    public EmailVerificationManager(EmailVerificationDao emailVerificationDao){
        this.emailVerificationDao=emailVerificationDao;
    }

    @Override
    public DataResult<List<EmailVerification>> getAll() {
        return new SuccessDataResult<List<EmailVerification>>(emailVerificationDao.findAll(),"Email data has listed");
    }

    @Override
    public Result add(EmailVerification emailVerification) {
            this.emailVerificationDao.save(emailVerification);

        return new SuccessResult("Verification completed successfully");
    }
}

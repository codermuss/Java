package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.EmailVerification;

import java.util.List;

public interface EmailVerificationService {
    DataResult<List<EmailVerification>> getAll();
    Result add(EmailVerification emailVerification);
}

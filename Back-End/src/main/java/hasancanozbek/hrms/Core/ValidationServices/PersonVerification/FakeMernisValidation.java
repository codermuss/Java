package hasancanozbek.hrms.Core.ValidationServices.PersonVerification;

import hasancanozbek.hrms.Entities.concretes.Employee;
import org.springframework.stereotype.Service;

@Service
public class FakeMernisValidation implements PersonValidationService {

    @Override
    public boolean isRealPerson(Employee employee) {
        return true;
    }
}

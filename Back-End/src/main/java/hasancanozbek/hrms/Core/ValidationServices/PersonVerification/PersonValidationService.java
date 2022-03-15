package hasancanozbek.hrms.Core.ValidationServices.PersonVerification;

import hasancanozbek.hrms.Entities.concretes.Employee;

public interface PersonValidationService {

    boolean isRealPerson(Employee employee);

}

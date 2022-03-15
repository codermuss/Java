package hasancanozbek.hrms.Business.concretes;

import hasancanozbek.hrms.Business.abstracts.EmployeeService;
import hasancanozbek.hrms.Core.ValidationServices.MailVerification.MailValidationService;
import hasancanozbek.hrms.Core.ValidationServices.PersonVerification.PersonValidationService;
import hasancanozbek.hrms.Core.utilities.results.*;
import hasancanozbek.hrms.DataAccess.abstracts.EmployeeDao;
import hasancanozbek.hrms.Entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;
    private MailValidationService mailValidationService;
    private PersonValidationService personValidationService;
    @Autowired
    public EmployeeManager(EmployeeDao employeeDao, MailValidationService mailValidationService, PersonValidationService personValidationService){
        this.employeeDao = employeeDao;
        this.mailValidationService = mailValidationService;
        this.personValidationService = personValidationService;
    }

    @Override
    public DataResult<List<Employee>> getEmployees() {
        return new SuccessDataResult<>(employeeDao.findAll(),"İş arayanlar listelendi");
    }

    @Override
    public Result addEmployee(Employee employee) {
        if (personValidationService.isRealPerson(employee) && mailValidationService.isRealEmail(employee.getEmail())){
            employeeDao.save(employee);
            return new SuccessResult("Yeni iş arayan eklendi");
        }
        else {
            return new ErrorResult("Kullanıcı doğrulanamadı");
        }
    }
}

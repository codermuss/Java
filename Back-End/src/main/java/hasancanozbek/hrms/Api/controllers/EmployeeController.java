package hasancanozbek.hrms.Api.controllers;

import hasancanozbek.hrms.Business.abstracts.EmployeeService;
import hasancanozbek.hrms.Core.utilities.results.DataResult;
import hasancanozbek.hrms.Core.utilities.results.Result;
import hasancanozbek.hrms.Entities.concretes.Employee;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/getemployees")
    public DataResult<List<Employee>> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping("/addemployee")
    public Result addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

}

package hasancanozbek.hrms.Api.controllers;

import hasancanozbek.hrms.Business.abstracts.EmployerService;
import hasancanozbek.hrms.Core.utilities.results.DataResult;
import hasancanozbek.hrms.Core.utilities.results.Result;
import hasancanozbek.hrms.Entities.concretes.Employer;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/employers")
public class EmployerController {

    private EmployerService employerService;
    @Autowired
    public EmployerController(EmployerService employerService){
        this.employerService = employerService;
    }

    @GetMapping("/getemployers")
    public DataResult<List<Employer>> getEmployers(){
        return employerService.getEmployers();
    }

    @PostMapping("/addemployer")
    public Result addEmployer(@RequestBody Employer employer){
        return employerService.addEmployer(employer);
    }
}

package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.EmployerService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {
    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employers>> getAll(){
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employers employers){
        return this.employerService.add(employers);
    }



}

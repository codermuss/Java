package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.EmployerApprovalService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.entities.concretes.EmployerApproval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/approval")
public class EmployersApprovalController {
    private EmployerApprovalService employerApprovalService;

    @Autowired
    public EmployersApprovalController(EmployerApprovalService employerApprovalService) {
        this.employerApprovalService = employerApprovalService;
    }

    @GetMapping("/getall")
    public DataResult<List<EmployerApproval>> getAll(){
        return this.employerApprovalService.getAll();
    }

//    @PostMapping("/add")
//    public Result add(@RequestBody Employers employers){
//        return this.employerApprovalService.add(employers);
//    }





}

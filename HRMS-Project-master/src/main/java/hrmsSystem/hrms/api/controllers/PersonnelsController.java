package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.PersonnelService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personnel")
@CrossOrigin
public class PersonnelsController {
    private PersonnelService personnelService;

    @Autowired
    public PersonnelsController(PersonnelService personnelService) {
        this.personnelService = personnelService;
    }

    @GetMapping("/getall")
    public DataResult<List<SystemPersonnel>> getAll() {
        return this.personnelService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SystemPersonnel systemPersonnel) {
        return this.personnelService.add(systemPersonnel);
    }


}

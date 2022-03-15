package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.EducationService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Education;
import hrmsSystem.hrms.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/educations")
@RestController
public class EducationsController {
    private EducationService educationService;

    @Autowired
    public EducationsController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Education>> getAll(){
        return this.educationService.getAll();
    }

    @GetMapping("/getByResumeId")
    public Result getByResumeId(int resumeId){

        return this.educationService.getEducationWithResumeId(resumeId);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Education education){
        return this.educationService.add(education);
    }

}

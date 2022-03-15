package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.ExperienceService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Experiences;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiences")
public class ExperiencesController {
    private ExperienceService experienceService;

    @Autowired
    public ExperiencesController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Experiences>> getAll(){
        return this.experienceService.getAll();
    }

    @GetMapping("/getByResumeId")
    public DataResult<List<Experiences>> getByResumeId(int resumeId){
        return this.experienceService.getByResumeId(resumeId);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Experiences experiences){
        return this.experienceService.add(experiences);
    }

}

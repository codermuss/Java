package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.SkillsService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Resume;
import hrmsSystem.hrms.entities.concretes.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    private SkillsService skillsService;

    @Autowired
    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }
    @GetMapping("/getAll")
    public DataResult<List<Skills>> getAll(){
        return this.skillsService.getAll();
    }

    @GetMapping("/getByResumeId")
    public DataResult<List<Skills>> getSkillsByResumeId(int resumeId){
        return this.skillsService.getSkillsByResumeId(resumeId);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Skills skills){
        return this.skillsService.add(skills);
    }


}

package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.LanguagesService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/languages")
@RestController
public class LanguagesController {
    private LanguagesService languagesService;

    @Autowired
    public LanguagesController(LanguagesService languagesService) {
        this.languagesService = languagesService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Languages>> getAll(){
        return this.languagesService.getAll();
    }

    @GetMapping("/getByResumeId")
    public DataResult<List<Languages>> getByResumeId(int resumeId){
        return this.languagesService.getLanguageByResumeId(resumeId);
    }

     @PostMapping("/add")
    public Result add(@RequestBody Languages languages){
        return this.languagesService.add(languages);
     }



}

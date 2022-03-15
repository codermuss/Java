package hrmsSystem.hrms.api.controllers;


import hrmsSystem.hrms.business.abstracts.JobSeekerService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
@CrossOrigin
public class JobSeekersController {
    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        super();
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobSeekers>> getAll() {
        return this.jobSeekerService.getAll();
    }
    @GetMapping("/getByUserId")
    public DataResult<List<JobSeekers>> getByUserId(int userId) {

        return this.jobSeekerService.getJobSeekerByUserId(userId);
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobSeekers jobSeekers) {
        return this.jobSeekerService.add(jobSeekers);

    }


}

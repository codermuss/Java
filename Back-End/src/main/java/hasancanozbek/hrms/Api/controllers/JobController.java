package hasancanozbek.hrms.Api.controllers;

import hasancanozbek.hrms.Business.abstracts.JobService;
import hasancanozbek.hrms.Core.utilities.results.DataResult;
import hasancanozbek.hrms.Core.utilities.results.Result;
import hasancanozbek.hrms.Entities.concretes.Job;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/jobs")
public class JobController {

    private JobService jobService;
    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/getjobs")
    public DataResult<List<Job>> getJobs(){
        return jobService.getJobs();
    }

    @PostMapping("/addJob")
    public Result addJob(@RequestBody Job job){
        return jobService.addJob(job);
    }
}

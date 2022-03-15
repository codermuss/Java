package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.EmailVerificationService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.EmailVerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/verify")
@CrossOrigin
public class VerificationController {

    private EmailVerificationService emailVerificationService;

    @Autowired
    public VerificationController(EmailVerificationService emailVerificationService) {
        this.emailVerificationService = emailVerificationService;
    }

    @GetMapping("/getall")
    public DataResult<List<EmailVerification>> getAll() {
        return this.emailVerificationService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody EmailVerification emailVerification) {
        return this.emailVerificationService.add(emailVerification);
    }



}

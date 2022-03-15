package com.example.hrms.verification.concretes;

import com.example.hrms.entity.User;
import com.example.hrms.verification.abstracts.EmailCheckService;
import org.springframework.stereotype.Service;

@Service
public class EmailCheckManager implements EmailCheckService {
    @Override
    public boolean CheckIfRealEmail(User user) {
        return true;
    }
}

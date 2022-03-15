package com.example.hrms.verification.abstracts;

import com.example.hrms.entity.User;

public interface EmailCheckService {
    boolean CheckIfRealEmail(User user);

}

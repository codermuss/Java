package com.example.hrms.verification.abstracts;

import com.example.hrms.entity.User;

public interface HrmsCheckService {
    boolean checkIfConfirmHrms(User user);
}

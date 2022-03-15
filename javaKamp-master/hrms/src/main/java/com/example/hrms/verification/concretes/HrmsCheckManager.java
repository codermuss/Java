package com.example.hrms.verification.concretes;

import com.example.hrms.entity.User;
import com.example.hrms.verification.abstracts.HrmsCheckService;
import org.springframework.stereotype.Service;

@Service
public class HrmsCheckManager implements HrmsCheckService {
    @Override
    public boolean checkIfConfirmHrms(User user) {
        return true;
    }
}

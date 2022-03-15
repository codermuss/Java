package com.example.hrms.verification.concretes;

import com.example.hrms.entity.User;
import com.example.hrms.verification.abstracts.MernisCheckService;
import org.springframework.stereotype.Service;

@Service
public class MernisCheckManager implements MernisCheckService {
    @Override
    public boolean checkIfRealPerson(User user) {
        return true;
    }
}

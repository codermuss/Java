package com.example.hrms.verification.abstracts;

import com.example.hrms.entity.User;

public interface MernisCheckService {
    boolean checkIfRealPerson(User user);
}

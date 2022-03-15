package com.example.hrms.repository.abstracts;

import com.example.hrms.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<Employer,Integer> {
    public boolean existsByEmail(String email);

    public Employer getByCompanyName(String companyName);
}

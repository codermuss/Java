package com.example.hrms.repository.abstracts;

import com.example.hrms.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Integer> {
    public boolean existsByEmail(String email);
    public boolean existsByIdentityNumber(String identityNumber);
}

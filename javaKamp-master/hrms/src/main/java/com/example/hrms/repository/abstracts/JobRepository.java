package com.example.hrms.repository.abstracts;

import com.example.hrms.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {
    public boolean existsByTitle(String title);

    public Job getByTitle(String jobTitle);
}

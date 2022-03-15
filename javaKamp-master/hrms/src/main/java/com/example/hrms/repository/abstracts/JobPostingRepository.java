package com.example.hrms.repository.abstracts;

import com.example.hrms.entity.Employer;
import com.example.hrms.entity.JobPosting;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobPostingRepository extends JpaRepository<JobPosting, Integer> {

  public List<JobPosting> getAllByIsActiveTrue();

  public List<JobPosting> getAllByIsActiveTrue(Sort sort);

  public List<JobPosting> findAllByIsActiveTrueAndEmployer_Id(int id);
}

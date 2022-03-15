package com.mustafayilmazdev.hrmsv2.data_access.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.hrmsv2.entities.concretes.Job_Seeker;

public interface Job_Seeker_Dao extends JpaRepository<Job_Seeker, Integer> {

}

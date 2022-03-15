package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import org.springframework.stereotype.Repository;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobSeeker;

@Repository
public interface JobSeekerDao extends UserDao<JobSeeker> {

}

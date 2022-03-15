package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}

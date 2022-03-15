package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {

}

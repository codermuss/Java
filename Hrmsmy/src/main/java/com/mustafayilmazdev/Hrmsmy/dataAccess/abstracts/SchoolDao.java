package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.School;

public interface SchoolDao extends JpaRepository<School, Integer> {

}

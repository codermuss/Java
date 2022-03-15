package com.mustafayilmazdev.Hrmsmy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.SchoolDepartment;

public interface SchoolDepartmentDao extends JpaRepository<SchoolDepartment, Integer> {

}

package com.mustafayilmazdev.hrmsv2.data_access.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.hrmsv2.entities.abstracts.User;

public interface User_Dao extends JpaRepository<User, Integer> {

}

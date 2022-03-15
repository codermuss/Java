package com.mustafayilmazdev.hrmsv2.data_access.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.hrmsv2.entities.concretes.Email_Validaton;

public interface Email_Validation_Dao extends JpaRepository<Email_Validaton, Integer> {

}

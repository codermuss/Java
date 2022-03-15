package com.mustafayilmazdev.hrms_v1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.hrms_v1.entities.concretes.IsPozisyonu;

public interface IsPozisyonuDao extends JpaRepository<IsPozisyonu, Integer> {

}

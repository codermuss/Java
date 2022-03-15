package com.mustafayilmazdev.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafayilmazdev.hrms.entities.concretes.IsPozisyonlari;

// JpaRepository verdiğin veri için Yanin Entity Anotasyonuyla belirtilmiş nesne için  yani IsPozisyonlari crud operasyonlarını hazırlar.
public interface IsPozisyonlariDao extends JpaRepository<IsPozisyonlari, Integer> {

}

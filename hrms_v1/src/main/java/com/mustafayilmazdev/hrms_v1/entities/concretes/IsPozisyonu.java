package com.mustafayilmazdev.hrms_v1.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity

@Table(name = "JobPositions")
public class IsPozisyonu {
	@javax.persistence.Id
	@GeneratedValue
	@Column(name = "Id")
	private int Id;
	@Column(name = "PositionName")
	private String PozisyonAdi;

	public IsPozisyonu() {
	}

	public IsPozisyonu(int id, String pozisyonAdi) {
		super();
		Id = id;
		PozisyonAdi = pozisyonAdi;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPozisyonAdi() {
		return PozisyonAdi;
	}

	public void setPozisyonAdi(String pozisyonAdi) {
		PozisyonAdi = pozisyonAdi;
	}

}

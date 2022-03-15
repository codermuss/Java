package com.mustafayilmazdev.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Spring anatasyon ile classın veritabanında hangi katmana karşılık geldiğini istiyor.
//Anotasyon classın çalışma anında onunla ilgili bilgi toplaması.
//Entity yaptığında product bir Entity'dir diyorsun.
//Entity dediğinde bu bir veritabanı nesnesidir diyorsun.
@Entity
@Table(name = "IsPozisyonlari")
public class IsPozisyonlari {

	@Id // sorgu yapılacak Id nin bu olduğunu söylüyor.
	@GeneratedValue // Id nin bir bir artacağını söylüyor
	@Column(name = "Id")
	private int id;

	@Column(name = "PozisyonAdi")
	private String PozisyonAdi;

	public IsPozisyonlari() {
	}

	public IsPozisyonlari(int id, String pozisyonAdi) {
		super();
		System.out.println(id);
		System.out.println(pozisyonAdi);
		this.id = id;
		PozisyonAdi = pozisyonAdi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPozisyonAdi() {
		return PozisyonAdi;
	}

	public void setPozisyonAdi(String pozisyonAdi) {
		PozisyonAdi = pozisyonAdi;
	}

}

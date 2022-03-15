package com.mustafayilmazdev.nLayeredDemoTekrar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@javax.persistence.Id
	@GeneratedValue
	@Column(name = "product_id")
	private int Id;

	@Column(name = "product_name")
	private String productname;

	public Product() {
	}

	public Product(int id, String productname) {
		super();
		Id = id;
		this.productname = productname;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getProductName() {
		return productname;
	}

	public void setProductName(String productName) {
		this.productname = productName;
	}

}

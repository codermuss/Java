package com.mustafayilmazdev.Hrmsmy.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data

public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userId;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;

	public User() {
		super();
	}

	public User(String email, String password) {
		super();

		this.email = email;
		this.password = password;
	}

	/*
	 * public int getUserId() { return userId; }
	 * 
	 * public String getEmail() { return email; }
	 * 
	 * public void setEmail(String email) { this.email = email; }
	 * 
	 * public String getPassword() { return password; }
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 */

}

package com.mustafayilmazdev.hrmsv2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "email_validation")
public class Email_Validaton {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "user_id")
	private int user_id;
	@Column(name = "email_validate_state")
	private boolean email_validate_state;

	public Email_Validaton() {
	}

	public Email_Validaton(int id, int user_id, boolean email_validate_state) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.email_validate_state = email_validate_state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public boolean isEmail_validate_state() {
		return email_validate_state;
	}

	public void setEmail_validate_state(boolean email_validate_state) {
		this.email_validate_state = email_validate_state;
	}

}

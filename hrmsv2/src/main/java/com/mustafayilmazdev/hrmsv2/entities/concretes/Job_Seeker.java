package com.mustafayilmazdev.hrmsv2.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_seekers")

public class Job_Seeker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int user_id;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "tc_no")
	private String tc_no;
	@Column(name = "date_of_birth")
	private Date date_of_birth;

	public Job_Seeker() {
	}

	public Job_Seeker(int user_id, String first_name, String last_name, String tc_no, Date date_of_birth, String email,
			String password) {

		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.tc_no = tc_no;
		this.date_of_birth = date_of_birth;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getTc_no() {
		return tc_no;
	}

	public void setTc_no(String tc_no) {
		this.tc_no = tc_no;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

}

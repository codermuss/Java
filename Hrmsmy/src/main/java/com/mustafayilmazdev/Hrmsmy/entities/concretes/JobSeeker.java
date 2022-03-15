package com.mustafayilmazdev.Hrmsmy.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mustafayilmazdev.Hrmsmy.entities.abstracts.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "job_seekers")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "resume" })
public class JobSeeker extends User {
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "nationality_id")
	private String nationality_id;
	@Column(name = "date_of_birth")
	private Date date_of_birth;

	@OneToOne(mappedBy = "jobSeeker")

	private Resume resume;

	public JobSeeker(String email, String password, String first_name, String last_name, String nationality_id,
			Date date_of_birth, Resume resume) {
		super(email, password);
		this.first_name = first_name;
		this.last_name = last_name;
		this.nationality_id = nationality_id;
		this.date_of_birth = date_of_birth;
		this.resume = resume;

	}

}

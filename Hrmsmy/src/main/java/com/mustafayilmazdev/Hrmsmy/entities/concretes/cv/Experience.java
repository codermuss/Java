package com.mustafayilmazdev.Hrmsmy.entities.concretes.cv;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.Resume;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "experiences")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "resume" })
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "experience_id")
	private int experienceId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "job_position_name")
	private String jobPositionName;

	@Column(name = "starting_date")
	private Date startingDate;

	@Column(name = "ending_date")
	private Date endingDate;

	@ManyToOne()
	@JoinColumn(name = "resume_id")
	private Resume resume;
}

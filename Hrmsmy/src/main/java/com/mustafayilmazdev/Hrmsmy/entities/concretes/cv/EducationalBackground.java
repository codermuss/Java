package com.mustafayilmazdev.Hrmsmy.entities.concretes.cv;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "educational_backgrounds")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "resume" })
public class EducationalBackground {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "educational_background_id")
	private int educationalBackgroundId;

	@Column(name = "starting_date")
	private Date startingDate;

	@Column(name = "ending_date")
	private Date endingDate;

	@ManyToOne()
	@JoinColumn(name = "school_department_id")
	private SchoolDepartment schoolDepartment;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "resume_id")
	private Resume resume;
}

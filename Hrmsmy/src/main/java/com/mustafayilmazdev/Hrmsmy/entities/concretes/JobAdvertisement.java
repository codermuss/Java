package com.mustafayilmazdev.Hrmsmy.entities.concretes;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_advertisements")

public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_advertisement_id")
	private int job_advertisement_id;

	@Column(name = "job_title")
	private String job_title;

	@Column(name = "job_description")
	private String job_description;

	@Column(name = "number_of_open_positions")
	private int number_of_open_positions;
	@Column(name = "min_salary")
	private int min_salary;
	@Column(name = "max_salary")
	private int max_salary;

	@Column(name = "application_deadline")
	private Date application_deadline;

	@Column(name = "release_date")
	private Date releaseDate;

	@Column(name = "is_active")
	private boolean isActive;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "job_position_id")
	private JobPosition job_position;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "city_id")
	private City city;
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "user_id")
	private Employer employer;

}

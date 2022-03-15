package com.mustafayilmazdev.Hrmsmy.entities.concretes.cv;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "school_departments")

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "educationalBackground" })
public class SchoolDepartment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_department_id")
	private int departmentId;

	@Column(name = "school_department_name")
	private String departmentName;

	@Column(name = "education_level")
	private String educationLevel;

	@ManyToOne()
	@JoinColumn(name = "school_id")
	private School school;

	@OneToMany(mappedBy = "schoolDepartment")
	private List<EducationalBackground> educationalBackground;

}

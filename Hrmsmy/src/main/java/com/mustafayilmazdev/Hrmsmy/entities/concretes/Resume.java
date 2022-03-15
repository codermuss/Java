package com.mustafayilmazdev.Hrmsmy.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.EducationalBackground;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.Experience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resumes")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resume_id")
	private int resumeId;

	@OneToOne()
	@JoinColumn(name = "user_id")
	private JobSeeker jobSeeker;

	@OneToMany(mappedBy = "resume")
	private List<EducationalBackground> educationalBackgrounds;
	@OneToMany(mappedBy = "resume")
	private List<Experience> experiences;
}

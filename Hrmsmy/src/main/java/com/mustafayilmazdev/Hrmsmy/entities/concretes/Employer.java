package com.mustafayilmazdev.Hrmsmy.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name = "employers")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Employer extends User {
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "web_address")
	private String web_address;
	@Column(name = "telephone_number")
	private String telephone_number;

	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;

	public Employer(String email, String password, String companyName, String web_address, String telephone_number,
			List<JobAdvertisement> jobAdvertisements) {
		super(email, password);
		this.companyName = companyName;
		this.web_address = web_address;
		this.telephone_number = telephone_number;
		this.jobAdvertisements = jobAdvertisements;
	}

}

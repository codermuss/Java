package com.example.hrms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User {

  @Column(name = "web_site")
  private String webSite;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "company_name")
  private String companyName;

  public Employer( String email, String password, String passwordAgain, String webSite, String phoneNumber, String companyName) {
    super(email, password, passwordAgain);
    this.webSite = webSite;
    this.phoneNumber = phoneNumber;
    this.companyName = companyName;
  }

  public Employer() {
  }

  public Employer(String companyName) {
    super();
    this.companyName = companyName;
  }

  public String getWebSite() {
    return webSite;
  }

  public void setWebSite(String webSite) {
    this.webSite = webSite;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
}

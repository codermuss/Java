package com.example.hrms.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Objects;


public class EmployerDto {

  @NotBlank(message = "website is mandatory")
  private String webSite;

  @NotBlank(message = "phone number is mandatory")
  private String phoneNumber;

  @NotBlank(message = "company name is mandatory")
  private String companyName;

  @NotBlank(message = "email is mandatory")
  @Email
  private String email;

  @NotBlank(message = "password is mandatory")
  private String password;

  @NotBlank(message = "password again is mandatory")
  private String passwordAgain;

  public EmployerDto() {}

  public EmployerDto(String webSite, String phoneNumber, String companyName, String email) {
    this.webSite = webSite;
    this.phoneNumber = phoneNumber;
    this.companyName = companyName;
    this.email = email;
  }

  public EmployerDto(
      String webSite,
      String phoneNumber,
      String companyName,
      String email,
      String password,
      String passwordAgain) {
    this.webSite = webSite;
    this.phoneNumber = phoneNumber;
    this.companyName = companyName;
    this.email = email;
    this.password = password;
    this.passwordAgain = passwordAgain;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @JsonIgnore
  @ApiIgnore
  public String getPassword() {
    return password;
  }

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public void setPassword(String password) {
    this.password = password;
  }

  @JsonIgnore
  @ApiIgnore
  public String getPasswordAgain() {
    return passwordAgain;
  }

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  public void setPasswordAgain(String passwordAgain) {
    this.passwordAgain = passwordAgain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmployerDto that = (EmployerDto) o;
    return Objects.equals(webSite, that.webSite)
        && Objects.equals(phoneNumber, that.phoneNumber)
        && Objects.equals(companyName, that.companyName)
        && Objects.equals(email, that.email)
        && Objects.equals(password, that.password)
        && Objects.equals(passwordAgain, that.passwordAgain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webSite, phoneNumber, companyName, email, password, passwordAgain);
  }
}

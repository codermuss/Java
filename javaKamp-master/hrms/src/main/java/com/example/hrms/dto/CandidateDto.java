package com.example.hrms.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CandidateDto {

  @NotBlank(message = "first name is mandatory")
  private String firstName;
  @NotBlank(message = "last name is mandatory")
  private String lastName;
  @NotBlank(message = "identity number is mandatory")
  private String identityNumber;
  @NotNull(message = "birth year is mandatory")
  private Integer birthYear;
  @NotBlank(message = "email is mandatory")
  @Email
  private String email;

  @NotBlank(message = "password is mandatory")
  private String password;
  @NotBlank(message = "password again is mandatory")
  private String passwordAgain;

  public CandidateDto() {
  }

  public CandidateDto(String firstName, String lastName, String identityNumber, Integer birthYear, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.identityNumber = identityNumber;
    this.birthYear = birthYear;
    this.email = email;
  }

  public CandidateDto(String firstName, String lastName, String identityNumber, Integer birthYear, String email, String password, String passwordAgain) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.identityNumber = identityNumber;
    this.birthYear = birthYear;
    this.email = email;
    this.password = password;
    this.passwordAgain = passwordAgain;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getIdentityNumber() {
    return identityNumber;
  }

  public void setIdentityNumber(String identityNumber) {
    this.identityNumber = identityNumber;
  }

  public Integer getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(Integer birthYear) {
    this.birthYear = birthYear;
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

}

package com.example.hrms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "user_id")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidate extends User {

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "identity_number")
  private String identityNumber;

  @Column(name = "birth_year")
  private Integer birthYear;

  public Candidate(String email, String password, String passwordAgain, String firstName, String lastName, String identityNumber, Integer birthYear) {
    super(email, password, passwordAgain);
    this.firstName = firstName;
    this.lastName = lastName;
    this.identityNumber = identityNumber;
    this.birthYear = birthYear;
  }
}

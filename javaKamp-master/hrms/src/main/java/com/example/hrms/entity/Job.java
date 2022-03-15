package com.example.hrms.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Job Entity icin yazilmistir. */
@Entity
@Table(name = "job_titles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonIgnore
  private Integer id;

  private String title;

  public Job(String title) {
    this.title = title;
  }
}

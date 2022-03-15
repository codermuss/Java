package com.example.hrms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="job_postings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    @Column(name="job_details")
    private String jobDetails;
    @Column(name="min_salary")
    private int minSalary;
    @Column(name="max_salary")
    private int maxSalary;
    @Column(name="number_of_vacant_positions")
    private int numberOfVacantPositions;
    @Column(name="application_deadline")
    private Date applicationDeadLine;
    @Column(name="is_active")
    private Boolean isActive;
    @ManyToOne(cascade=CascadeType.REFRESH)
    @JoinColumn(name="city_id", referencedColumnName="id")
    private City city;
    @ManyToOne(cascade=CascadeType.REFRESH)
    @JoinColumn(name="job_titles_id", referencedColumnName="id")
    private Job job;
    @ManyToOne(cascade=CascadeType.REFRESH)
    @JoinColumn(name="employer_id", referencedColumnName="user_id")
    private Employer employer;

}

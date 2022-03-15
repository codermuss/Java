package com.example.hrms.dto;

import com.example.hrms.entity.City;
import com.example.hrms.entity.Employer;
import com.example.hrms.entity.Job;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobPostingDto {

    private String jobDetails;
    private int minSalary;
    private int maxSalary;
    private int numberOfVacantPositions;
    private Date applicationDeadLine;
    private String cityName;
    private String title;
    private String companyName;
}

package com.mustafayilmazdev.Hrmsmy.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDetailsDto {

	private String company_name;
	private String job_position_name;
	private int number_of_open_positions;
	private Date release_date;
	private Date application_deadline;
}

package com.mustafayilmazdev.Hrmsmy.entities.dtos;

import java.util.List;

import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.EducationalBackground;
import com.mustafayilmazdev.Hrmsmy.entities.concretes.cv.Experience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto {

	private List<EducationalBackground> educationalBackgrounds;
	private List<Experience> experiences;
}

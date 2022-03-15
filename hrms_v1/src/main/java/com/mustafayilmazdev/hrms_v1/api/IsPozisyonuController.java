package com.mustafayilmazdev.hrms_v1.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.hrms_v1.business.abstracts.IsPozisyonuService;
import com.mustafayilmazdev.hrms_v1.entities.concretes.IsPozisyonu;

@RestController
@RequestMapping("/api/hrmsv1")
public class IsPozisyonuController {
	IsPozisyonuService isPozisyonuService;

	@Autowired
	public IsPozisyonuController(IsPozisyonuService isPozisyonuService) {
		super();
		this.isPozisyonuService = isPozisyonuService;
	}

	@GetMapping("/getall")
	public List<IsPozisyonu> getAll() {
		return this.isPozisyonuService.getAll();
	}

}

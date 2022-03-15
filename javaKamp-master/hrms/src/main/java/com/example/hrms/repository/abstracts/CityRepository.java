package com.example.hrms.repository.abstracts;

import com.example.hrms.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
   public City getByCityName(String cityName);
}

package com.example.hrms.dto;

import java.util.Objects;

public class CityDto {

  private String cityName;

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public CityDto() {}

  public CityDto(String cityName) {
    this.cityName = cityName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CityDto cityDto = (CityDto) o;
    return cityName.equals(cityDto.cityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityName);
  }
}

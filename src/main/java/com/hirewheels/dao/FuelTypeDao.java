package com.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirewheels.entities.FuelType;

public interface FuelTypeDao  extends JpaRepository<FuelType, Integer>  {

}

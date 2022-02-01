package com.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirewheels.entities.City;

public interface CityDao extends JpaRepository<City, Integer>  {

}

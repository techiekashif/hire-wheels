package com.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirewheels.entities.VehicleCategory;

public interface VehicleCategoryDao extends JpaRepository<VehicleCategory, Integer> {

}

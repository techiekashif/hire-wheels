package com.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirewheels.entities.Vehicle;

public interface VehicleDao extends JpaRepository<Vehicle, Integer> {

}

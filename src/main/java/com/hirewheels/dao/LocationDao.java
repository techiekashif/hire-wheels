package com.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirewheels.entities.Location;

public interface LocationDao extends JpaRepository<Location, Integer>  {

}

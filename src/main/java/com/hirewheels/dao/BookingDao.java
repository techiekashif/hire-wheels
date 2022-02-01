package com.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirewheels.entities.Booking;

public interface BookingDao extends JpaRepository<Booking, Integer> {

}

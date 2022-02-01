package com.hirewheels.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="booking")
@Data
public class Booking {
	
	@Column(name="booking_id")
	@Id
	@GeneratedValue
	private int bookingId;
	
	@Column(name = "pickup_date", nullable = false)
	private LocalDate pickupDate;
	
	@Column(name = "dropoff_date", nullable = false)
	private LocalDate droppOffDate;
	
	@Column(name = "booking_date", nullable = false)
	private LocalDate bookingDate;
	
	@Column(name = "amount", nullable = false)
	private int amount;
}

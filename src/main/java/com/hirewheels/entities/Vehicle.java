package com.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "vehicle")
@Data
public class Vehicle {

	@Column(name = "vehicle_id")
	@Id
	@GeneratedValue
	private int vehicleId;

	@Column(name = "vehicle_model", nullable = false, length = 50)
	private String vehicleModel;

	@Column(name = "vehicle_number", nullable = false, length = 10)
	private int vehicleNumber;

	@Column(name = "color", nullable = false)
	private String color;

	@Column(name = "availability_status", nullable = false, length = 1)
	private int availabilityStataus;

	@Column(name = "vehicle_image_url", length = 500, nullable = false)
	private String vehicleImageUrl;

}

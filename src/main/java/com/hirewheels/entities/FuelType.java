package com.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "fuel_type")
@Data
public class FuelType {

	@Column(name = "fuel_type_id")
	@Id
	@GeneratedValue
	private int fuleTypeId;
	
	@Column(name = "fuel_type", nullable = false, length = 50, unique = true)
	private String fuelType;
}

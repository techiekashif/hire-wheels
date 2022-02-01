package com.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "vehicle_category")
@Data
public class VehicleCategory {

	@Column(name = "vehicle_category_id")
	@Id
	@GeneratedValue
	private int vehicleCategoryId;
	
	@Column(name = "vehicle_category_name", nullable = false, unique = true)
	private String vehicleCategoryName;
}

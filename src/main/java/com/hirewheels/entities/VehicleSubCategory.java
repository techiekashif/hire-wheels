package com.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "vehicle_subcategory")
@Data
public class VehicleSubCategory {

	@Column(name = "vehicle_subcategory_id")
	@Id
	@GeneratedValue
	private int vehicleSubCategoryId;
	
	@Column(name = "vehicle_subcategory_name", length = 50, nullable = false, unique = true)
	private String vehicleSubCategoryName;
	
	@Column(name = "price_per_day", nullable = false)
	private int pricePerDay;
}

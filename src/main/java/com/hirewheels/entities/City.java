package com.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "city")
@Data
public class City {
	
	@Column(name = "city_id", length = 10)
	@Id
	@GeneratedValue
	private int cityId;
	
	@Column(name = "city_name", nullable = false, length = 50)
	private String cityName;

}

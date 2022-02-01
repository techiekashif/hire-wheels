package com.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role {

	@Column(name = "role_id")
	@Id
	@GeneratedValue
	private int roleId;
	
	@Column(name="role_name",length = 50, nullable = false, unique = true)
	private String rollName;
}

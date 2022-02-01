package com.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "user_id", length = 10)
	private int userId;
	
	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;
	
	@Column(name = "lastt_name", length = 50, nullable = false)
	private String lastName;
	
	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "password", length = 50, nullable = false)
	private String password;
	
	@Column(name = "mobile_no", length = 50, nullable = false, unique = true)
	private String mobileNo;
	
	@Column(name = "wallet_money", length = 10)
	private Long walletMoney;
	
}

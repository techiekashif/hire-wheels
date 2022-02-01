package com.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirewheels.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

}

package com.hirewheels.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hirewheels.entities.Role;

public interface RoleDao extends JpaRepository<Role, Integer>  {

}

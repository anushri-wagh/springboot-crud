package com.springboot.first.springboot10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.first.springboot10.model.employee;

@Repository
public interface employeerepository extends JpaRepository< employee, Integer> {
//will include all the crud methods to interact with database
}

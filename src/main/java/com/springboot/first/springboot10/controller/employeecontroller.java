package com.springboot.first.springboot10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.first.springboot10.repository.employeerepository;
import com.springboot.first.springboot10.model.employee;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class employeecontroller {

    @Autowired
    private employeerepository Employeerepository;

    @GetMapping
    public List<employee> getallemployees()
    {
        return Employeerepository.findAll();
    }
}

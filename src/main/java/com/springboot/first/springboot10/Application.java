package com.springboot.first.springboot10;

import com.springboot.first.springboot10.model.employee;
import com.springboot.first.springboot10.repository.employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) { SpringApplication.run(Application.class, args);
	}
  @Autowired
  employeerepository Employeerepository;
	@Override
	public void run(String... args) throws Exception {

		employee emp=new employee();
		emp.setId(1);
		emp.setFirstname("Anushri");
		emp.setLastname("Wagh");
		emp.setEmail("wagh.anushri@gmail.com");
		Employeerepository.save(emp);

		employee emp1=new employee();
		emp1.setId(2);
		emp1.setFirstname("Shantanu");
		emp1.setLastname("patil");
		emp1.setEmail("shanatanu@gmail.com");
		Employeerepository.save(emp1);

	}
}

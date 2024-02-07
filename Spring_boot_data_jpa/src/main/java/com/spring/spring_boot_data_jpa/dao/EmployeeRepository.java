package com.spring.spring_boot_data_jpa.dao;


import com.spring.spring_boot_data_jpa.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

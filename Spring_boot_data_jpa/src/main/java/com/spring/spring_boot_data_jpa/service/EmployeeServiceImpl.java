package com.spring.spring_boot_data_jpa.service;


import com.spring.spring_boot_data_jpa.Entity.Employee;
import com.spring.spring_boot_data_jpa.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;



    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }



    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }



    public Employee getEmployee(int id) {

        Employee employee=null;
        Optional<Employee> optional=employeeRepository.findById(id);
        if (optional.isPresent()){
            employee=optional.get();
        }

        return employee;
    }



    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}

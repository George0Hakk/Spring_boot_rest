package com.spring.spring_boot_data_jpa.service;



import com.spring.spring_boot_data_jpa.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
    
    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}

package com.employeemanagement.service;

import com.employeemanagement.exception.EmployeeException;
import com.employeemanagement.model.Employee;

import java.util.List;

public interface EmpoyeeService {



    List<Employee> getAllEmployees() throws EmployeeException;

    Employee getEmployeeById(Long id) throws EmployeeException;

    Employee createEmployee(Employee employee) throws EmployeeException;


    Employee updateEmployee(Long id, Employee employee) throws EmployeeException;

    Employee deleteEmployee(Long id) throws EmployeeException;







}

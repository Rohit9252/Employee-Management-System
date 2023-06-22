package com.employeemanagement.service;

import com.employeemanagement.exception.EmployeeException;
import com.employeemanagement.model.Employee;
import com.employeemanagement.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmpoyeeService {


    private final EmployeeRepository employeeRepository;




    @Override
    public List<Employee> getAllEmployees() throws EmployeeException {

       return employeeRepository.findAll();

    }

    @Override
    public Employee getEmployeeById(Long id) throws EmployeeException {

        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeException("Employee not found"));

    }

    @Override
    public Employee createEmployee(Employee employee) throws EmployeeException {

        Optional<Employee> employee1 = employeeRepository.findByEmail(employee.getEmail());

        if(employee1.isPresent()) {
            throw new EmployeeException("Employee already exists");
        }


        return employeeRepository.save(employee);


    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) throws EmployeeException {

            Employee employee1 = employeeRepository.findById(id).orElseThrow(() -> new EmployeeException("Employee not found"));

            employee1.setFirstName(employee.getFirstName());
            employee1.setLastName(employee.getLastName());
            employee1.setEmail(employee.getEmail());

            return employeeRepository.save(employee1);
    }

    @Override
    public Employee deleteEmployee(Long id) throws EmployeeException {

        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new EmployeeException("Employee not found"));

        employeeRepository.delete(employee);

        return employee;
    }


}

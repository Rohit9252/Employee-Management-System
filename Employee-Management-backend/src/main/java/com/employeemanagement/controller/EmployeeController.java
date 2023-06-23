package com.employeemanagement.controller;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import com.employeemanagement.exception.EmployeeException;
import com.employeemanagement.model.Employee;
import com.employeemanagement.service.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class EmployeeController {


    private final EmployeeServiceImpl employeeService;

    // get all
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() throws EmployeeException {

        return ResponseEntity.ok(employeeService.getAllEmployees());

    }

    // get by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) throws EmployeeException {

        return ResponseEntity.ok(employeeService.getEmployeeById(id));

    }
    // create
    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) throws EmployeeException {

       return new ResponseEntity<>( employeeService.createEmployee(employee), HttpStatus.CREATED);


    }


    // delete by id

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Long id) throws EmployeeException {


        return  new ResponseEntity<>(employeeService.deleteEmployee(id), HttpStatus.OK);

    }

    // update by id

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @Valid @RequestBody Employee employee) throws EmployeeException {

        return new ResponseEntity<>(employeeService.updateEmployee(id, employee), HttpStatus.OK);

    }








}

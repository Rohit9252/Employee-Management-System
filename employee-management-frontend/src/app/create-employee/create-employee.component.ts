import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../service/employee.service';
import { Router } from '@angular/router';
import { first } from 'rxjs';
import { FormControl, ValidatorFn } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {

  employee: Employee = new Employee();

  constructor(private employeeService: EmployeeService,
    private router: Router, private toastr: ToastrService) { }

  ngOnInit(): void {

  }

  saveEmployee() {
    this.employeeService.createEmployee(this.employee).subscribe(data => {
      console.log(data);

        this.toastr.success('Employee Created Successfully!', 'Success!');
        this.goToEmployeeList();
    
  
    },
      error => {this.toastr.error(error.error.message, 'Error!')
      console.log(error);
    });
  }



  goToEmployeeList() {
    this.router.navigate(['/employees']);
  }


  onSubmit() {
    console.log(this.employee);
    this.saveEmployee();
  }


}

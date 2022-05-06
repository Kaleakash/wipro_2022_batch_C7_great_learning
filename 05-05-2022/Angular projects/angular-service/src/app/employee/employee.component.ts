import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl } from '@angular/forms';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees:Array<Employee>=[];

  employeeRef = new FormGroup({
      id :new FormControl(),
      name:new FormControl(),
      age:new FormControl()
  })
  constructor(public empser:EmployeeService) { } //DI for Employee Service 

  ngOnInit(): void {
  }

  loadEmpoyeeDetails() {
    this.empser.loadEmployeeDetails().subscribe(result=>this.employees=result,
      error=>console.log(error),()=>console.log("completed"))
  }

  storeData() {
    let employee = this.employeeRef.value;
    this.empser.storeEmployeeDetails(employee).subscribe(result=>console.log(result),error=>console.log(error),()=>console.log("completed"))
    this.employeeRef.reset();
  }
}

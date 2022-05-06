import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees:Array<Employee>=[];

  constructor(public empser:EmployeeService) { } //DI for Employee Service 

  ngOnInit(): void {
  }

  loadEmpoyeeDetails() {
    this.empser.loadEmployeeDetails().subscribe(result=>this.employees=result,
      error=>console.log(error),()=>console.log("completed"))
  }
}

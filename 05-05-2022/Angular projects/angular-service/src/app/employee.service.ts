import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(public http:HttpClient) { } // DI for HttpClient 

  loadEmployeeDetails():Observable<Employee[]>{
    return this.http.get<Employee[]>("http://localhost:3000/employees");
  }
}

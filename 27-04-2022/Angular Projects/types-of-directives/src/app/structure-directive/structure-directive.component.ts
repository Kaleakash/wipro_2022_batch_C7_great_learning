import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent implements OnInit {
  f1:boolean = true;
  f2:boolean = false;
  f3:boolean = false;
  flag : boolean = false;
  b1: string ="Show";
  names:Array<string>=["Ravi","Raj","Seeta","Meeta","Ajay","Vijay"]

  c1:Customer=new Customer(100,"Ravi",21);
  customers :Array<Customer>=[];    
  constructor() { }
  // it is a life cycle method of component it will call only once after constructor. 
  ngOnInit(): void {
    // let obj1 = new Customer(100,"Ramesh",15000);
    // let obj2 = new Customer(101,"Ajay",18000);
    // let obj3 = new Customer(102,"Vijay",20000);
    // this.customers.push(obj1);
    // this.customers.push(obj2);
    // this.customers.push(obj3);
  }

  
  fun1(){
    this.f3 = true;
  }

  toggle(){
    if(this.flag){
      this.b1="Show"
      this.flag=false;
    }else {
        this.b1="Hide"
        this.flag=true;
    }
  }
}

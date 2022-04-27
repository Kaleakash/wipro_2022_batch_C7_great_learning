import { Component, OnInit } from '@angular/core';

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

  constructor() { }

  ngOnInit(): void {
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

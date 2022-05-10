import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-testing';
  id:number=100;
  name:string ="Raj Deep";
  result : boolean = true;
  
  displayInfo(name:string): string {
    return "Welcome "+name;
  }

}

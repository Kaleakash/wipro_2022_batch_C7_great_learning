import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  user:string="";
  constructor(public router:Router) { } // router DI 

  ngOnInit(): void {
    let obj = sessionStorage.getItem("user");
    if(obj!=null){
      this.user = obj;
    }
  }

  logout() {

    sessionStorage.removeItem("user");
    this.router.navigate(["login"]);
  }
}

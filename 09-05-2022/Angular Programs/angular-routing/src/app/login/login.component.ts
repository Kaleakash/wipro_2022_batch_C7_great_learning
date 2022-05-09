import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  loginRef = new FormGroup({
    email:new FormControl(),
    password:new FormControl()
  });
  msg:string="";
  constructor(public router:Router) { } // DI for router API 

  ngOnInit(): void {
  }

  checkUser() {
    let login = this.loginRef.value;
    /*
    this.ls.checkUser(login).subscribe(result=> {
        if(result=="success"){

        }else {

        }
    },error=>console.log(error),()=>console.log("done"))
    */
    if(login.email=="raj@gmail.com" && login.password=="123"){
        sessionStorage.setItem("user","raj@gmail.com");
        // 
        this.router.navigate(["home"]);
    } else {
        this.msg = "email or password is wrong";
    }   
    this.loginRef.reset();
  }
}

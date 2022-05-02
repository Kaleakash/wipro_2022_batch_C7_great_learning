import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent implements OnInit {

  loginRef = new FormGroup({
                        // it is equal to requried attribute in html page 
    email : new FormControl("",[Validators.required,Validators.minLength(3)]),
            // ? optional, * 0 to many and + 1 to many 
    password : new FormControl("",[Validators.required,Validators.pattern("[a-z]+@[0-9]+")])
  })
 msg:string =""

  constructor() { }

  ngOnInit(): void {
  }
  checkUser() {
    let login = this.loginRef.value;
    if(login.email=="Raj@gmail.com" && login.password=="123"){
      this.msg="Successfully login"
    }else {
      this.msg = "Failure try once again"
    }
    this.loginRef.reset();
  }
}

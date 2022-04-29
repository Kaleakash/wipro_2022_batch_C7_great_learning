import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent implements OnInit {

  loginRef = new FormGroup({
    email : new FormControl(),
    password : new FormControl()
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

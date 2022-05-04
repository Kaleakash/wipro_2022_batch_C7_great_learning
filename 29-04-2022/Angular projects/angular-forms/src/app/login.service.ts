import { Injectable } from "@angular/core";

@Injectable()
export class LoginService {

    checkUserDetails(login:any):string {
        if(login.email=="Raj@gmail.com" && login.pass=="123"){
                return "success";
        }else {
                return "failure";
        }
    }
}
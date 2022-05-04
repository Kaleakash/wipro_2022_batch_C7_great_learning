

export class CustomService {


    checkUserDetails(login:any):string {
        if(login.email=="Raj@gmail.com" && login.pass=="123"){
            return "success";
        }else {
            return "failure";
        }
    }
}
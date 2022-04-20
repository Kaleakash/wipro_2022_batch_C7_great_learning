// // ES5 style function style in Typescript 
// function Customer() {
//         this.cid = 100;
//         this.cname = "Ravi";
//         this.disCustomerInfo = function() {
//             console.log("customer function")
//             console.log("customer id is "+this.cid);
//             console.log("customer name is "+this.cname);
//         }
// }
// var c1 = new Customer();
// c1.disCustomerInfo();
// // ES6 style object creation in Typescript 
// class Employee {
//     private eid:number =100;
//     private ename:string = "Ravi";
//     disEmpInfo() : void {
//         console.log("Emmloyee function")
//         console.log("Employee id is "+this.eid);
//         console.log("Employee name is "+this.ename);
//     }
// }
// let emp1 = new Employee();
// emp1.disEmpInfo();
// //console.log(emp1.eid)
// //console.log(emp1.ename)
// // empty constructor  
// class Employee {
//     private eid:number =100;
//     private ename:string = "Ravi";
//     constructor() {
//         console.log("memory created....")
//     }
//     disEmpInfo() : void {
//         console.log("Emmloyee function")
//         console.log("Employee id is "+this.eid);
//         console.log("Employee name is "+this.ename);
//     }
// }
// let emp1 = new Employee();
// emp1.disEmpInfo();
// Parameterized constructor 
// class Employee {
//     private eid:number;
//     private ename:string;
//     constructor(eid:number=0,ename:string="Unkown") {
//         console.log("memory created....")
//         this.eid=eid;
//         this.ename=ename;
//     }
//     disEmpInfo() : void {
//         console.log("Emmloyee function")
//         console.log("Employee id is "+this.eid);
//         console.log("Employee name is "+this.ename);
//     }
// }
// let emp1 = new Employee(1,"Ravi");
// emp1.disEmpInfo();
// let emp2 = new Employee(2,"Raju");
// emp2.disEmpInfo();
// let emp3 = new Employee(3);
// emp3.disEmpInfo();
// let emp4 = new Employee();
// emp4.disEmpInfo();
// constructor short cut intialization 
// class Employee {
//     //private eid:number;
//     //private ename:string;
//     constructor(private eid:number,public ename:string) {
//         //this.eid=eid;
//         //this.ename=ename;
//     }
//     disEmpInfo() : void {
//         console.log("Emmloyee function")
//         console.log("Employee id is "+this.eid);
//         console.log("Employee name is "+this.ename);
//     }
// }
// let emp1 = new Employee(1,"Ravi");
// emp1.disEmpInfo();
// constructor short cut intialization 
var Employee = /** @class */ (function () {
    function Employee(eid, ename) {
        this.eid = eid;
        this.ename = ename;
    }
    Employee.prototype.disEmpInfo = function () {
        console.log("Emmloyee function");
        console.log("Employee id is " + this.eid);
        console.log("Employee name is " + this.ename);
    };
    return Employee;
}());
var emp1 = new Employee(1, "Ravi");
emp1.disEmpInfo();

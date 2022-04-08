// defined the object in literal style 
// var emp1 = {id:100,name:"Ravi",salary:12000,skillSet:["C","C++","Java"],address:{city:"Bangalore",state:"kar"}};
// var emp2 = {id:101,name:"Raju",salary:15000,skillSet:["C","C++","Java"],address:{city:"Bangalore",state:"kar"}};
// document.write("Object in literal style <br/>");
// document.write(" <br/>id is "+emp1.id);
// document.write(" <br/>name is "+emp1.name);
// document.write(" <br/>salary is "+emp1.salary);
// document.write("<br/> Skill Set "+emp1.skillSet[0]);
// emp1.skillSet.forEach(ss=>document.write("<br/> Skill Set "+ss));
// document.write("<br/> City is "+emp1.address.city)
// document.write("<br/> State is "+emp1.address.state)
// document.write("<br/> State is "+emp1.address.address)

// function Employee() {
//         this.id = 100;              // instance variable. 
//         this.name  ="Ravi";
//         this.age = 21;
//         this.displayEmpInfo = function() {
//                 document.write("<br/>Employee details are <br/>");
//                 document.write("<br/> Id is "+this.id);
//                 document.write("<br/> Name is "+this.name);
//                 document.write("<br> Aage is "+this.age);
//         }
// }
// //Employee();
// var emp1 = new Employee();
//     alert(emp1.id);
//     alert(emp1.name);
// emp1.id=101;
// emp1.name="Ajay";
// alert(emp1.id);
// alert(emp1.name);
// emp1.displayEmpInfo();
// var emp2 = new Employee();
// emp2.displayEmpInfo();
// //document.write(emp1);
// //console.log(emp1);
// //displayEmpInfo();

// passing the value while creating the memory 
// function Employee(id,name,age) {
//     this.id = id;              // instance variable. 
//     this.name  =name;
//     this.age = age;
//     this.displayEmpInfo = function() {
//             document.write("<br/>Employee details are <br/>");
//             document.write("<br/> Id is "+this.id);
//             document.write("<br/> Name is "+this.name);
//             document.write("<br> Aage is "+this.age);
//     }
// }
// var emp1 = new Employee(100,"Ravi",21);
// var emp2 = new Employee(101,"Ramesh",24);
// emp1.displayEmpInfo();
// emp2.displayEmpInfo();

// function Employee() {
//     this.a= 100;     // instance variable 
//     let b = 200;
//     var c = 300;
//     this.dis1 = function () {
//         alert("Dis1 function ")
//         alert(this.a)
//         alert(b);
//         alert(c);
//         dis2();
//     }
//     function dis2() {
//         alert("Dis2 function")
//     }
// }

// let emp1 = new Employee();
// //alert(emp1.a)
// //alert(emp1.b)
// //alert(emp1.c);
// emp1.dis1();
// //emp1.dis2();
// //dis2();


// creating user-defined object in function style 
function Employee(id,name){
    this.id = id;
    this.name = name;
    this.disInfo= function() {
        document.write("<br/> Employee Details ")
        document.write("<br/> Id is "+this.id);
        document.write("<br/> Name is "+this.name);
    }
}
var emp1 = new Employee(100,"Ravi");
var emp2 = new Employee(101,"Mahesh");
emp1.disInfo();
emp2.disInfo();
alert(emp1.age);
alert(emp2.age);
Employee.prototype.age =21;     // we are adding dynamic property for Employee object 
alert(emp1.age);
alert(emp2.age);
emp1.age = 25;
emp2.age = 28;
Employee.prototype.info = function () {     // we are adding dynamic behaviour for Employee object. 
    alert("Id is "+this.id+" Name is "+this.name +" Age is "+this.age);
}
emp1.info();
emp2.info();

















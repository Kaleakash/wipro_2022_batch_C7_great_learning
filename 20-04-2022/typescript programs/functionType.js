var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
function add(a, b) {
    console.log(a + " " + b);
}
add(10, 20);
add(1.1, 2.2);
add("Raj", "Deep");
//add(10);        //Error 
//add(1,2,3);         //error 
function empInfo(id, name, salary) {
    console.log(id + " " + name + " " + salary);
}
empInfo(1, "Ravi", 12000.50);
function dis1() {
    return "Welcome";
}
function dis2() {
    return 100;
}
function dis3() {
    return true;
}
function dis4() {
}
function dis5() {
    //return 100;   
    //return "Ravi";
}
function dis6() {
}
// function stdInfo(id?:number, name?:string, age?:number): void {       // optional parameter 
//         console.log(id+" "+name+" "+age);       // undefined consider 
// }   
// stdInfo(1,"Ravi",21);
// stdInfo(2,"Ramesh");
// stdInfo(3,"Rakesh");
// stdInfo(4)
// stdInfo()
// function stdInfo(id:number=0, name:string="unkown", age:number=18): void {      // default intialization parameter 
//     console.log(id+" "+name+" "+age);       // undefined consider 
// }   
// stdInfo(1,"Ravi",21);
// stdInfo(2,"Ramesh");
// stdInfo(3,"Rakesh");
// stdInfo(4)
// stdInfo()
// function stdInfo(id:number,name:string,age:number,skillSet?:string[]):void {
// }
// //let skillSet:string[]=["C","C++"];
// let skillSet:string[]=[];
// stdInfo(1,"Ravi",21,skillSet);
function stdInfo(id, name, age) {
    var skillSet = [];
    for (var _i = 3; _i < arguments.length; _i++) {
        skillSet[_i - 3] = arguments[_i];
    }
    skillSet.forEach(function (v) { return console.log(v); });
}
var skillSet = ["C", "C++", "java", "Python"];
stdInfo(1, "Ravi", 21); // zero
stdInfo(2, "Ramesh", 24, "C"); // 1
stdInfo(3, "Lokesh", 34, "C", "Java");
stdInfo(4, "Mahesh", 32, "Java", "Python", "Angular"); // many 
stdInfo(5, "Seeta", 26, skillSet[0], skillSet[1], skillSet[2], skillSet[3]);
stdInfo.apply(void 0, __spreadArray(__spreadArray([5, "Seeta", 26], skillSet, false), ["Angular"], false)); // spread operator 

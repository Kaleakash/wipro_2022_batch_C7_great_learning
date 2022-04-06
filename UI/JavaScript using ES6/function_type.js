// // noraml style funtion 
// display1();
// function display1() {
//     document.write("<br/> Display1 normal function syntax");
// }
// //display1();
// //display2();
// // expression style function 
// var display2 = function display() {
//                 document.write("<br/> Expression style function with function name")
//             }
// //display3();               
// display2();
// let display3 = function() {
//         document.write("<br/> Expression style function with anonymous funtion")
// }
// display3();

// let display4 = ()=>document.write("<br/>This is arrow function");
// display4();

// // expression style passing parameter 
// let addNumber1 = function(a,b){
//     var sum = a+b;
//     return sum;
// }
// document.write("<br/>Sum of two number is using expression style "+addNumber1(100,200));
// // arrow style passing parameter by default it return without return keyword.  if we 
// // write single starement. 
// let addNumber2 =(a,b)=>a+b;
// document.write("<br/>Sum of two number is using arrow style "+addNumber2(100,200));
// // find largest using expression style 
// let findLargest1= function(a,b){
//     if(a>b){
//         return "a is largest"
//     }else {
//         return "b is largest"
//     }
// }
// document.write("<br/> Largest of two number is using epxression style "+findLargest1(10,5));
// // find larges using arrow style 
// let findLargest2= (a,b)=> {
//     if(a>b){
//         return "a is largest"
//     }else {
//         return "b is largest"
//     }
// }
// document.write("<br/> Largest of two number is using arrow style "+findLargest2(10,5));

function greeting(fname,callback){
    return "Welcome "+callback(fname);
}
let maleInfo = function(fname){
    return "Mr "+fname;
}
let femaleInfo = (fname)=>"Miss "+fname;

document.write("<br/> "+greeting("Raj",maleInfo));
document.write("<br/> "+greeting("Seeta",femaleInfo));
document.write("<br/>"+greeting("Ajay",function(fname){
    return "Mr "+fname;
}))
document.write("<br/> "+greeting("Reeta",(fname)=>"Miss "+fname));













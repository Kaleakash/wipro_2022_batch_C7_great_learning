// let num =[1,2,3,4,5,6];
// document.write("<br/> All elements are <br/>")
// num.forEach(v=>document.write(" "+v));
// document.write("<br/>Map method in array<br/>");
// num.map(ele=>ele+1).forEach(v=>document.write(" "+v));
// document.write("<br/> All elements are <br/>")
// num.forEach(v=>document.write(" "+v));
// document.write("<br/> All elements are <br/>")
// num.filter(v=>v%2==0).forEach(v=>document.write(" "+v));

//1st way 
// num.forEach(display);
// function display(v){
//     document.write(" "+v);
// }
// 2nd way 
// num.forEach(function display(v){
//     document.write(" "+v);
// });

// 3rd way 
// num.forEach(function(v){
//     document.write(" "+v);
// });

// 4th way 
// num.forEach((v)=>document.write(" "+v));
let num1 = [100,200,300,400];
document.write(" "+num1);
let num2 = num1;            // same memory two referene. num1 and num2 
let num3 = num1.slice();      // it use to create copy from num1 to num3 
document.write("<br/> "+num1);
document.write("<br/> "+num2);
document.write("<br/> "+num3);
num1.push(1);
num2.push(2);
num3.push(3);
document.write("<br/> "+num1);
document.write("<br/> "+num2);
document.write("<br/> "+num3);








// noraml style funtion 
display1();
function display1() {
    document.write("<br/> Display1 normal function syntax");
}
//display1();
//display2();
// expression style function 
var display2 = function display() {
                document.write("<br/> Expression style function with function name")
            }
//display3();               
display2();
let display3 = function() {
        document.write("<br/> Expression style function with anonymous funtion")
}
display3();

let display4 = ()=>document.write("<br/>This is arrow function");
display4();
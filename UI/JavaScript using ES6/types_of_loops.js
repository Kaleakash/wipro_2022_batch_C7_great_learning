let num =[100,200,300,400,500,600];
document.write("<br/> Array with loops");
document.write("<br/>"+num);
document.write("<br/> display all element using for loop");
for(let i=2;i<num.length;i++){
    document.write("<br/> "+num[i]);
}
document.write("<br/> Using for in loop");
for(let i in num){                  // it will give the index position 
    document.write("<br/>Index value is "+i+" Value is "+num[i]);
}
document.write("<br/> using for of loop");
for(let n of num){              // it will give value directly 
    document.write("<br/> Value is "+n);
}
document.write("<br/> Using for each function passing the function name ")
num.forEach(display);
function display(v){
    document.write("<br/> Value is "+v)
}
document.write("<br/> Using for each function passing the function body with name")
num.forEach(function display(v){
    document.write("<br/> Value is "+v)
})
document.write("<br/> Using for each function passing the function body without name")
num.forEach(function(v){
    document.write("<br/> Value is "+v)
})
document.write("<br/> using for each function with arrow style function")
num.forEach(v=>document.write("<br/>Value is "+v));


let obj1 = [];      // literal style array object creation 
let obj2 = new Array(); // creating object using new keyword. 
document.write("<br/> size of the array "+obj1.length);
document.write("<br/> size of the array "+obj2.length);
let obj3 = [10,20,30,40,50];        //initialization 
let obj4 = new Array(10,20,30,40,50);   // initialization 
document.write("<br/> size of the array "+obj3.length);
document.write("<br/> size of the array "+obj4.length);
obj1.push(10);
obj1.push(20);
obj1.push(30);      // it is use to add at last 
obj1.unshift(100);  
obj1.unshift(200);
obj1.unshift(300);  // it is use to add at begining 
document.write("<br/> size of the array "+obj1.length);
document.write("<br/> Add element are "+obj1);
document.write("<br/> 0 position index value "+obj1[0])
document.write("<br/> 1 position index value "+obj1[1])
obj1.pop(); // remove from a last 
obj1.shift();   // remove from the begining 
document.write("<br/> All element are "+obj1);
// splice method this method is use to add, remove and update any element in array 
//obj1.splice(2,1)   // 1st parameter index position, and 2nd paramter number of element to remove 
//obj1.splice(1,2);   // from 1 index position remove 2 elements. 
//obj1.splice(2,0,1111);  // 1st parameter index position, 2nd parameter number of parameter to 
                            // delete and 3 to n parameter add the element 
//obj1.splice(2,1,1111);  //replace 2 position element by 1111
//obj1.splice(1,2,1111);
//obj1.splice(1,2,1111,2222,3333,4444);
//document.write("<br/> Add element are "+obj1);
// document.write("<br/>")
// let result1 = obj1.find(search);
// function search(n){
//     if(n==20){
//         return n;
//     }else {
//         return undefined;
//     }
// }
//document.write(result1)

let result1 = obj1.find(e=>e==100);     // it element is present it will return that element 
document.write("<br/> "+result1);
let result2 = obj1.find(e=>e==1000);     // it element is present it will return undefined  
document.write("<br/> "+result2);
let result3 = obj1.findIndex(e=>e==100);     // it element is present it will return index positiono  
document.write("<br/> "+result3);
let result4 = obj1.findIndex(e=>e==1000);     // it element is present it will return -ve value   
document.write("<br/> "+result4);
let result5 = obj1.find(function(e){
    if(e==1000){
        return e;
    }else {
        return undefined;
    }
})
document.write("<br/> "+result5);



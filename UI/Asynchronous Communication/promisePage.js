// ES5 style promise object creation 
var obj1 = new Promise(function(resolved,rejected){
    resolved("Done the task..."),
    rejected("Error Generated...")
})

obj1.then(function(data){
    console.log("Then called"+data);
}).catch(function(error){
    console.log("Catch called.."+error)
})
//ES6 style promisse object creation 

let obj2 = new Promise((resolved,rejected)=> {
    rejected("Error Generated...")
})

obj2.then(data=>console.log("Then called.."+data)).catch(error=>console.log("catch called.."+error))
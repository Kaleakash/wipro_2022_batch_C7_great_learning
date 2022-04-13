let obj;
function loadObject() {
obj = new XMLHttpRequest();         // object created...
    obj.onreadystatechange=callback;    // keep track about the reqeust 
//obj.open("Get","demo.txt");         // for this page send the request ie static page. 
obj.open("Get","https://jsonplaceholder.typicode.com/todos")
obj.send()
}

function callback() {
    //alert(obj.readyState);
    if(obj.readyState==4){
       // alert(obj.responseText);
       //console.log(obj.responseText);
       let data = JSON.parse(obj.responseText);
       console.log(data.length);
       data.forEach(e=>console.log("Id "+e.id+" title "+e.title));
    }
}
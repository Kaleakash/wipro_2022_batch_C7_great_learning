let emp = {id:100,name:"Ravi",age:21};
document.write("<br/> Literal style object <br/>")
document.write("<br/> Id is "+emp.id);
document.write("<br/> Name is "+emp.name);
document.write("<br/> AGe is "+emp.age);

//JSON.stringify();     convert json/object literal to string 
//JSON.parse();         string to json object. 

let empString = JSON.stringify(emp);        // convert object to string 
document.write("<br/> Id is "+empString.id);
document.write("<br/> Name is "+empString.name);
document.write("<br/> AGe is "+empString.age);

let empJson = JSON.parse(empString);      // string to object 
document.write("<br/> JSON Object<br/>")
document.write("<br/> Id is "+empJson.id);
document.write("<br/> Name is "+empJson.name);
document.write("<br/> AGe is "+empJson.age);

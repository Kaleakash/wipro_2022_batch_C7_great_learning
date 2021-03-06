async function loadData() {
    // fetch("http://localhost:3000/employees").
    // then(res=>res.json()).then(result=>console.log(result)).catch(error=>console.log(error));
 
    //ES6 style 
    // fetch("http://localhost:3000/employees").
    // then(res=>res.json()).then(result=>{
    //         let empRow = result.map(emp=>"<li>"+emp.id+" "+emp.name+" "+emp.age+"</li>");
    //         console.log(empRow)
    //         document.getElementById("data").innerHTML=empRow
    // }).catch(error=>console.log(error));

   // ES7 style
   try{
   let response =await fetch("http://localhost:3000/employees");
   let result = await response.json();
   let empRow = result.map(emp=>"<li>"+emp.id+" "+emp.name+" "+emp.age+"</li>");
    // console.log(empRow)
    document.getElementById("data").innerHTML=empRow
   }catch(e){
       console.log(e)
   }
}




function addEmloyee() {
    let idValue = document.getElementById("id").value
    let nameValue = document.getElementById("name").value
    let ageValue = document.getElementById("age").value

    fetch("http://localhost:3000/employees",
        {method:"post",
            body:JSON.stringify({
            id:idValue,
            name:nameValue,
            age:ageValue
        })
    ,headers:{
        "content-type":"application/json"
    }}).then(result=>{
        console.log(result);
        loadData();
    }).catch(error=>console.log(error));
    document.getElementById("id").value=""
    document.getElementById("name").value=""
    document.getElementById("age").value=""
}



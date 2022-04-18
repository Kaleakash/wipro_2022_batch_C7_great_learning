function setValue() {
    alert("set value callled...")
    //let name = "Ravi Kumar";
    let name = document.getElementById("name").value;
    sessionStorage.setItem("obj1",name);
    localStorage.setItem("obj2",name);
    document.getElementById("name").value="";
}



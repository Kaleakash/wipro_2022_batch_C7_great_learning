function getValue() {
    alert("get value callled...")
    let name1 = sessionStorage.getItem("obj1");
    let name2 = localStorage.getItem("obj2");
    document.getElementById("a").innerHTML="Value from session storage is "+name1;
    document.getElementById("b").innerHTML="Value from local storage is "+name2;
}
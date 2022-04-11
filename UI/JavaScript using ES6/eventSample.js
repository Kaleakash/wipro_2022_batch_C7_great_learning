function display1() {
    alert("Event fired...")
}

function readValue(){
    //1st way to get the value of text field using name property 
    //var name = document.getElementsByName("user")[0].value;
    //alert("Welcome user "+name);

    //2nd way to get the value of text field using id property 
    var name = document.getElementById("u1").value;
    //alert("Welcome user "+name);

    // get the value of tag 
    var msg = document.getElementsByTagName("h1")[0].innerHTML;
    alert(msg);
    document.getElementById("msg").value="Welcome "+name;
    document.getElementById("u1").value="";
    document.getElementById("out").innerHTML="Welome "+name;
}

function domOperation() {
    let userName = document.getElementById("userName").value;
    let userAge = document.getElementById("userAge").value;
    let pTag = document.createElement("p");
 //   let pTagContent = document.createTextNode("Welcome to JS Training");
 let pTagContent = document.createTextNode("Name "+userName+" Age "+userAge); 
    pTag.appendChild(pTagContent);      // content added in p tag 
    pTag.setAttribute("class","myPTagClass")
    document.getElementById("menu").appendChild(pTag);      // add p  tag in dom element. 
    document.getElementById("userName").value="";
    document.getElementById("userAge").value="";
}




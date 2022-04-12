// // synchronous statement execution 
// // document.write("<br/>1st statement");
// // document.write("<br/>2nd statement");
// // document.write("<br/>3rd statement");
// let i=0;
// // asynchronous statement execution 
// document.write("<br/>1st statement");
// // setTimeout(()=> {
// //     document.write("<br/>2nd statement");
// // },3000) 
// setTimeout(() => {
//     document.getElementById("obj1").innerHTML="<br/>2nd Statement";
// }, 3000);
// setInterval(()=> {
//     //document.getElementById("obj2").innerHTML="<br/> 4th Statement "+i;
//     //i++;
//     document.write(i)
//     i++;
// },1000);
// document.write("<br/>3rd statement");
let i=0;
var obj = setInterval(()=> {
    let dd = new Date();
    document.getElementById("obj1").innerHTML=dd.getHours()+" : "+dd.getMinutes()+" : "+dd.getSeconds();

    if(i%2==0){
       // document.getElementsByTagName("body")[0].bgColor="RED";
       document.getElementById("obj2").style.fontFamily="Arial";
       document.getElementById("obj2").style.backgroundColor="Orange";
    }else {
        //document.getElementsByTagName("body")[0].bgColor="GREEN";
        document.getElementById("obj2").style.fontFamily="Monotype corsiva";
        document.getElementById("obj2").style.backgroundColor="Green";

    }

    i++;
},1000)

function stop() {
 clearInterval(obj);   
}



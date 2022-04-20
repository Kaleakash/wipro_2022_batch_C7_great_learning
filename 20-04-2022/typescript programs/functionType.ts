function add(a,b){          // by defaut data type any consider. 
    console.log(a+" "+b)
}

add(10,20);
add(1.1,2.2);
add("Raj","Deep");
//add(10);        //Error 
//add(1,2,3);         //error 


function empInfo(id:number,name:string,salary:number){// number of parameter as well as type of parameter must be match 
    console.log(id+" "+name+" "+salary);
}
empInfo(1,"Ravi",12000.50);

function dis1() : string {          // string return type 
    return "Welcome";
}
function dis2() : number {      // number return type 
    return 100;
}

function dis3(): boolean {      // boolean return type 
    return true;
}
function dis4() : void {            // no return type 
    
}
function dis5() : any {         // any return type or even no return type 
    //return 100;   
    //return "Ravi";

}
function dis6() {      // default any consider 

}

// function stdInfo(id?:number, name?:string, age?:number): void {       // optional parameter 
//         console.log(id+" "+name+" "+age);       // undefined consider 
// }   
// stdInfo(1,"Ravi",21);
// stdInfo(2,"Ramesh");
// stdInfo(3,"Rakesh");
// stdInfo(4)
// stdInfo()

// function stdInfo(id:number=0, name:string="unkown", age:number=18): void {      // default intialization parameter 
//     console.log(id+" "+name+" "+age);       // undefined consider 
// }   
// stdInfo(1,"Ravi",21);
// stdInfo(2,"Ramesh");
// stdInfo(3,"Rakesh");
// stdInfo(4)
// stdInfo()


// function stdInfo(id:number,name:string,age:number,skillSet?:string[]):void {

// }
// //let skillSet:string[]=["C","C++"];
// let skillSet:string[]=[];

// stdInfo(1,"Ravi",21,skillSet);

function stdInfo(id:number,name:string,age:number,...skillSet:string[]):void {      // rest 
        skillSet.forEach(v=>console.log(v));
}

let skillSet:string[]=["C","C++","java","Python"];

stdInfo(1,"Ravi",21);           // zero
stdInfo(2,"Ramesh",24,"C");     // 1
stdInfo(3,"Lokesh",34,"C","Java");
stdInfo(4,"Mahesh",32,"Java","Python","Angular");       // many 
stdInfo(5,"Seeta",26,skillSet[0],skillSet[1],skillSet[2],skillSet[3]);
stdInfo(5,"Seeta",26,...skillSet,"Angular");      // spread operator 









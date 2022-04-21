class MyClass {
    private a : number=10;
    public  b : number =20;
    protected c : number =30;
    d: number =40;
}
class MyAnother extends MyClass {

    public disInfo(): void {
       // console.log("a "+a);
       console.log("b "+this.b);    //public can access in sub class 
       console.log("c "+this.c);    // protected can access in sub class
       console.log("d "+this.d)     // we can access in sub class  
    }
} 
let emp1 = new MyClass();
//console.log(emp1.a);//private 
console.log(emp1.b);    // public
//console.log(emp1.c)   // protected can't access 
console.log(emp1.d);    // default like public 
let obj2 =new MyAnother();
obj2.disInfo();
/*
private : within a same class outside class we can't access.
public : within a same class, outside class with object and sub class directly can accesss.
protected : within a same class but outside class with object 
can't access in sub class we can access directly

*/
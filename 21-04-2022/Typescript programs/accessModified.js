var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var MyClass = /** @class */ (function () {
    function MyClass() {
        this.a = 10;
        this.b = 20;
        this.c = 30;
        this.d = 40;
    }
    return MyClass;
}());
var MyAnother = /** @class */ (function (_super) {
    __extends(MyAnother, _super);
    function MyAnother() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    MyAnother.prototype.disInfo = function () {
        // console.log("a "+a);
        console.log("b " + this.b); //public can access in sub class 
        console.log("c " + this.c); // protected can access in sub class
        console.log("d " + this.d); // we can access in sub class  
    };
    return MyAnother;
}(MyClass));
var emp1 = new MyClass();
//console.log(emp1.a);//private 
console.log(emp1.b); // public
//console.log(emp1.c)   // protected can't access 
console.log(emp1.d); // default like public 
var obj2 = new MyAnother();
obj2.disInfo();
/*
private : within a same class outside class we can't access.
public : within a same class, outside class with object and sub class directly can accesss.
protected : within a same class but outside class with object
can't access in sub class we can access directly

*/ 

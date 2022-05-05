// it is use to map the json data retrieve from backend technologies. 
export interface Product {
    id:number;
    title:string;
    price:number;
    description:number;
    category:string;
    image:string;
    rating:Rating;      // use to map the Reating interface 
}

export interface Rating {
    rate:number;
    count:number;
}

/*
export class Produt {
    constructor(public id:number, public title:string ...... ){}
}

*/
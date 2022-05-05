import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'    // it is equal to providers in app.module.ts file to register class. 
})
export class ProductService {

  constructor(public http:HttpClient) { }   // DI for HttpClient API.


  loadFakeProduct() {
    this.http.get("https://fakestoreapi.com/products").
    subscribe(result=>console.log(result),
    error=>console.log(error),
    ()=>console.log("done!"));
  }
}

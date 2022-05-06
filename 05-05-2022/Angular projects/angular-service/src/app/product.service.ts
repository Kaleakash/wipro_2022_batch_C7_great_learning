import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import {Product} from './product';
@Injectable({
  providedIn: 'root'    // it is equal to providers in app.module.ts file to register class. 
})
export class ProductService {

  constructor(public http:HttpClient) { }   // DI for HttpClient API.


  // loadFakeProduct() {
  //   this.http.get("https://fakestoreapi.com/products").
  //   subscribe(result=>console.log(result),
  //   error=>console.log(error),
  //   ()=>console.log("done!"));
  // }
  
  // converting all json data developing in any languge into product array. 
  loadFakeProduct():Observable<Product[]> {
    return this.http.get<Product[]>("https://fakestoreapi.com/products");
  }
}

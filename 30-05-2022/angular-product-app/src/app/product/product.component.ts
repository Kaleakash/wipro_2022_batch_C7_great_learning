import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products:Array<Product>=[];   // product array memory created..
  storeMsg:string ="";
  constructor(public ps:ProductService) { } // DI for ProductService 

  ngOnInit(): void {
    this.loadAllProduct();
  }
  loadAllProduct(): void {
    this.ps.loadAllProductInfo().subscribe(result=> {
      this.products=result;
    })    
  }
  storeProduct(productRef:NgForm): void {
    let product = productRef.value;
    console.log(product);
    this.ps.storeProduct(product).subscribe(result=> {
      this.storeMsg=result;
    },error=>console.log(error),()=> {
      this.loadAllProduct();
    })
    productRef.reset();
  }
}

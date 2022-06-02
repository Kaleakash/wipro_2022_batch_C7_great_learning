import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products:Array<Product>=[];   // product array memory created..

  constructor(public ps:ProductService) { } // DI for ProductService 

  ngOnInit(): void {
    this.loadAllProduct();
  }

  loadAllProduct(): void {
    this.ps.loadAllProductInfo().subscribe(result=> {
      this.products=result;
    })
    
  }
}

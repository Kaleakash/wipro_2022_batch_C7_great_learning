import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor(public pser:ProductService) { }   // DI for Service class 

  ngOnInit(): void {
  }

  loadProducts() {
    console.log("event called..")
    this.pser.loadFakeProduct();
  }
}

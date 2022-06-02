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
  deleteMsg:string="";
  flag:boolean = false;
  pid:number=0;
  price:number=0.0;
  updateMsg:string ="";
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

  deleteRec(pid:number): void {
   // console.log(pid);
   this.ps.deleteProduct(pid).subscribe(result=> {
    this.deleteMsg=result
   },error=>console.log(error),()=> {
    this.loadAllProduct();
   })
  }
  updateRec(product:Product): void {
    this.flag = true;
    this.pid = product.pid;
    this.price=product.price;
    //console.log(product);
  }
  updateProductFromDb(){
    let produt = {pid:this.pid,price:this.price}
    this.ps.updateProdcut(produt).subscribe(result=> {
      this.updateMsg=result
    },error=> console.log(error),()=> {
      this.flag=false;
      this.loadAllProduct();
    })
  }
}

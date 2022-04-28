import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent implements OnInit {

  styleVariable={"color":"red","font-size":"24pt"};
  f1:boolean = true;
  f2:boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

}

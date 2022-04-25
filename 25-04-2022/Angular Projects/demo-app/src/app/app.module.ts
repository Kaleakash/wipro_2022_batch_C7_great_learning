import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CustomComponent } from './custom.component';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent,CustomComponent
  ],
  imports: [
    BrowserModule
  ],

  bootstrap: [AppComponent]
})

export class AppModule { }

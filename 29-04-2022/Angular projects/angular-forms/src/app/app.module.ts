import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { TdfLoginPageComponent } from './tdf-login-page/tdf-login-page.component';
import { MdfLoginPageComponent } from './mdf-login-page/mdf-login-page.component';
import { LoginService } from './login.service';

@NgModule({
  declarations: [
    AppComponent,
    TdfLoginPageComponent,
    MdfLoginPageComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule
  ],
  providers: [LoginService],          // provide service class details.  
  bootstrap: [AppComponent]
})
export class AppModule { }

import { Router } from '@angular/router';
import { Component } from '@angular/core';
import { ILoginData } from '../../Models/i-login-data';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  loginData:ILoginData = {
    email:'luigi.guajana@gmail.com',
    password:'password'
  }

  constructor(
    private authSvc:AuthService,
    private router:Router
    ){}

    signIn(){

      this.authSvc.login(this.loginData)
      .subscribe(data => {
        this.router.navigate(['/dashboard'])
      })

    }
}

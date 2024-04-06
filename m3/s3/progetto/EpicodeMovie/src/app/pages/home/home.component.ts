import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { UsersService } from '../../users.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  constructor(private http:HttpClient,private UsersSvc:UsersService){}

  ngOnInit(){

    this.http.get('http://localhost:3000/users').subscribe()

  }
}

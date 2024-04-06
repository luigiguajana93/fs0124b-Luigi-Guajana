import { UsersService } from './../../users.service';
import { Component } from '@angular/core';
import { IUser } from '../../Models/i-user';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrl: './users.component.scss'
})
export class UsersComponent {
  user:IUser[] = []
  arrLike:IUser[] =[]

  constructor(private UsersSvc:UsersService){}

ngOnInit(){
  this.UsersSvc.$user.subscribe(user =>{
    this.user = user
  });
  this.UsersSvc.$like.subscribe(arrLike =>{
    this.arrLike = arrLike
  });

}

canc(id:number){
  this.UsersSvc.delete(id).subscribe()
}


like(id:number){
  this.UsersSvc.addToLike(id)

}

}

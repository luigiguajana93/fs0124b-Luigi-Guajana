import { Component } from '@angular/core';
import { MoviesService } from '../../movies.service';
import { UsersService } from '../../users.service';
import { IPopular } from '../../Models/i-popular';
import { IUser } from '../../Models/i-user';
import { AuthService } from '../../auth/auth.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrl: './profile.component.scss'
})
export class ProfileComponent {
  movieLiked:IPopular[]=[]
  currUser:IUser| null = null;

  constructor(private moviesSvc:MoviesService, private AuthSvc:AuthService){}

  ngOnInit():void {

    this.AuthSvc.user$.subscribe(user =>this.currUser=user)
    console.log(this.currUser?.favorite)

    this.moviesSvc.$like.subscribe(like =>this.movieLiked=like)


  }







}

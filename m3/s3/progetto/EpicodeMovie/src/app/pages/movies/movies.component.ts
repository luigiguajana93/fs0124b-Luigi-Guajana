import { Component } from '@angular/core';
import { IPopular } from '../../Models/i-popular';
import { MoviesService } from '../../movies.service';


@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.scss'
})
export class MoviesComponent {
  movie:IPopular[] = []
  arrLike:IPopular[] =[]

  constructor(private MoviesSvc:MoviesService){}

  ngOnInit(){
    this.MoviesSvc.$user.subscribe(movie =>{
      this.movie = movie
    });
    this.MoviesSvc.$like.subscribe(arrLike =>{
      this.arrLike = arrLike
    });

  }

  canc(id:number){
    this.MoviesSvc.delete(id).subscribe()
  }




  like(id:number){
    this.MoviesSvc.addToLike(id)

  }





}

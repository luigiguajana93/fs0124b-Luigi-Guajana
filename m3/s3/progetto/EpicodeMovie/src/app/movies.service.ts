import { Injectable } from '@angular/core';
import { environment } from '../environments/environment.development';
import { IPopular } from './Models/i-popular';
import { BehaviorSubject, tap } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { IUser } from './Models/i-user';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {


  moviesUrl:string = environment.moviesUrl

  movieLiked:IPopular[]=[]
  currUser:IUser| null = null;

  movieArray:IPopular[]=[]
  arrLike:IPopular[]=[]

  likeSubject = new BehaviorSubject<IPopular[]>([])

  $like =this.likeSubject.asObservable()

  movieSubject = new BehaviorSubject<IPopular[]>([]);
  $user = this.movieSubject.asObservable()


  constructor(private http:HttpClient) {
    this.getAll().subscribe (data =>{
      this.movieSubject.next(data)
      this.movieArray = data;
    })
  }

  getAll(){
    return this.http.get<IPopular[]>(this.moviesUrl)
  }

  getById(id:number){
    return this.movieArray.find(m => m.id == id)
  }

  delete(id:number){
    return this.http.delete<IPopular>(this.moviesUrl+'/'+id)
    .pipe(tap(()=>{
      this.movieArray = this.movieArray.filter(m => m.id != id)
      this.movieSubject.next(this.movieArray)
    }))
  }

  addToLike(id:number):void {
    const addLike = this.getById(id);
    if(addLike){
      if(!this.arrLike.some(item =>item.id == id))
      this.arrLike.push(addLike);
      this.likeSubject.next(this.arrLike);
    }
  }





}

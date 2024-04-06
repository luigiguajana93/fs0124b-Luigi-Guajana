import { Injectable } from '@angular/core';
import { environment } from '../environments/environment.development';
import { IUser } from './Models/i-user';
import { BehaviorSubject, tap } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  usersUrl:string = environment.usersUrl

  usersArray:IUser[]=[]
  arrLike:IUser[]=[]

  likeSubject = new BehaviorSubject<IUser[]>([])

  $like =this.likeSubject.asObservable()

  userSubject = new BehaviorSubject<IUser[]>([]);
  $user = this.userSubject.asObservable()


  constructor(private http:HttpClient) {
    this.getAll().subscribe (data =>{
      this.userSubject.next(data)
      this.usersArray = data;
    })
  }

  getAll(){
    return this.http.get<IUser[]>(this.usersUrl)
  }

  getById(id:number){
    return this.usersArray.find(u => u.id == id)
  }

  delete(id:number){
    return this.http.delete<IUser>(this.usersUrl+'/'+id)
    .pipe(tap(()=>{
      this.usersArray = this.usersArray.filter(p => p.id != id)
      this.userSubject.next(this.usersArray)
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

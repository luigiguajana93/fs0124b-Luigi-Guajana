import { Injectable } from '@angular/core';
import { iPhoto } from './Models/iphoto';
import { BehaviorSubject, tap } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PhotoService {

  apiUrl:string = 'https://jsonplaceholder.typicode.com/photos'

  photoArray:iPhoto[] = []
  arrLike:iPhoto[] =[]

  likeSubject = new BehaviorSubject<iPhoto[]>([])

  $like =this.likeSubject.asObservable()

photoSubject = new BehaviorSubject<iPhoto[]>([]);

$photo = this.photoSubject.asObservable()

  constructor(private http:HttpClient) {
    this.getAll().subscribe (data =>{
      this.photoSubject.next(data)
      this.photoArray = data;
    })
  }

  getAll(){
    return this.http.get<iPhoto[]>(this.apiUrl)
  }

  getById(id:number){
    return this.photoArray.find(p => p.id == id)
  }

  delete(id:number){
    return this.http.delete<iPhoto>(this.apiUrl+'/'+id)
    .pipe(tap(()=>{
      this.photoArray = this.photoArray.filter(p => p.id != id)
      this.photoSubject.next(this.photoArray)
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

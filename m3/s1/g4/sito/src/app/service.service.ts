import { Oggetto } from './Models/oggetto';
import { Injectable } from '@angular/core';
import { iPost} from './Models/posts';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  getAllPost():Promise<iPost[]>{
    return fetch('../assets/db.json')
    .then(res => res.json())
    .then((res:Oggetto)=>res.posts)

  }

getActivePost():Promise<iPost[]>{

  return this.getAllPost()
    .then(res=>res.filter((p:iPost)=>p.active))
}

getInactivePost():Promise<iPost[]>{
  return this.getAllPost()
    .then(res=>res.filter((p:iPost)=>!p.active))
}




}
function res(value: any): iPost[] | PromiseLike<iPost[]> {
  throw new Error('Function not implemented.');
}


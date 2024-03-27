import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product, iPhone } from './Models/iphone';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PhoneService {

  apiUrl:string = 'https://dummyjson.com/products';

  subject= new Subject<iPhone[]>();

  $prefer =  this.subject.asObservable()

  add(prefer:iPhone[]){
    this.subject.next(prefer)
  }


  constructor(private http:HttpClient) { }

getAll(){
  return this.http.get<Product>(this.apiUrl)
}






}

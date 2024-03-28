import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product, iPhone } from './Models/iphone';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PhoneService {

  apiUrl:string = 'https://dummyjson.com/products';

  favSubject= new Subject<iPhone[]>();
  cartSubject= new Subject<iPhone[]>();

  $prefer = this.favSubject.asObservable()
  $cart= this.cartSubject.asObservable()


  addFav(prefer:iPhone[]){
    this.favSubject.next(prefer)
  }

  addCart(prefer:iPhone[]){
    this.cartSubject.next(prefer)
  }


  constructor(private http:HttpClient) { }

getAll(){
  return this.http.get<Product>(this.apiUrl)
}






}

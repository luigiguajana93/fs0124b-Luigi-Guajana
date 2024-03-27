import { Product } from './../../Models/iphone';
import { Component } from '@angular/core';
import { iPhone } from '../../Models/iphone';
import { PhoneService } from '../../phone.service';
import { Observable, Subscription } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

phones:iPhone[] = []
prefer:iPhone[] = []
cart: iPhone[]=[]
sub!:Subscription

constructor(private phoneSvc:PhoneService){}

ngOnInit(){



  this.phoneSvc.getAll().subscribe(phones =>{
    this.phones = phones.products
  })




}


send(product:iPhone){
  this.prefer.push(product)
}

}

import { Component } from '@angular/core';
import { iPhone } from '../../Models/iphone';
import { PhoneService } from '../../phone.service';

@Component({
  selector: 'app-shoppingcart',
  templateUrl: './shoppingcart.component.html',
  styleUrl: './shoppingcart.component.scss'
})
export class ShoppingcartComponent {
  phones:iPhone[] =[]
  prefer:iPhone[] =[]
  cart : iPhone[] = []
  constructor(private phoneSvc:PhoneService){}


  ngOnInit(){
    
  }
}

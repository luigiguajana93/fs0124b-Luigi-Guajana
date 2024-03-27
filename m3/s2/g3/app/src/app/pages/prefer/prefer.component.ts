import { Component } from '@angular/core';
import { iPhone } from '../../Models/iphone';
import { PhoneService } from '../../phone.service';

@Component({
  selector: 'app-prefer',
  templateUrl: './prefer.component.html',
  styleUrl: './prefer.component.scss'
})
export class PreferComponent {
phones:iPhone[] =[]
prefer:iPhone[] =[]
cart : iPhone[] = []
constructor(private phoneSvc:PhoneService){}

ngOnInit(){

  
}



}

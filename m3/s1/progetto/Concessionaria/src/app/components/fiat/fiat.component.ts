import { Component } from '@angular/core';
import { iAuto } from '../../Models/auto';
import { AutoService } from '../../auto.service';

@Component({
  selector: 'app-fiat',
  templateUrl: './fiat.component.html',
  styleUrl: './fiat.component.scss'
})
export class FiatComponent {
  cars!:iAuto[];
  marchio!:string;
  marchioLogo!: string;



  constructor(private AutoSvc:AutoService){}

  ngOnInit():void {
    this.getCars()
    }

    async getCars(){
      const res = await fetch('../../../assets/db.json');
      const response = await res.json();
      this.cars = response;
      this.cars = this.cars.filter((auto)=>auto.brand === 'Fiat')
      this.marchioLogo= this.cars[0].brandLogo;
      this.marchio = this.cars[0].brand;
    }

}


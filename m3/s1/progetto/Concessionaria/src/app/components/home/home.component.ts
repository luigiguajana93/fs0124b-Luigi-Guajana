import { AutoService } from './../../auto.service';
import { Component } from '@angular/core';
import { iAuto } from '../../Models/auto';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

cars!:iAuto[];
randomCar : iAuto[] = [];
marchi!: string[];



constructor(private AutoSvc:AutoService){}

ngOnInit():void {
  this.getCars()
  }

  async getCars(){
    const res = await fetch('../../../assets/db.json');
    const response = await res.json();
    this.cars = response;
    this.marchi = this.getMarchi();
    this.getRandomAuto(2);
  }

  getMarchi():string[]{
    const marchi:string[] =[];
    let marchio:string = '';
    for (let i = 0; i < this.cars.length; i++) {
      if (marchio != this.cars[i].brandLogo) {
        marchio = this.cars[i].brandLogo;
        marchi.push(this.cars[i].brandLogo);
      }
    }
    return marchi;
  }


getRandomAuto(num:number){
  const disponibili:number[] =[];
  for ( let i = 0; i < num ; i++){
    const index = Math.floor(Math.random()*this.cars.length)
    if(disponibili.includes(index))
    this.getRandomAuto(num-i);
    disponibili.push(index);
    this.randomCar.push(this.cars[index]);
  }
}


}




import { Injectable } from '@angular/core';
import { iAuto } from './Models/auto';

@Injectable({
  providedIn: 'root'
})
export class AutoService {

  cars!:iAuto[];
  randomAuto: iAuto[] = [];
  brands!:string[];




  getAllCar():Promise<iAuto[]>{
    return fetch('../assets/db.json')
    .then (res => res.json())
    .then((res:iAuto[]) => res)
  }



  getDisponibili():Promise<iAuto[]>{
    return this.getAllCar()
    .then(res=>res.filter((a:iAuto)=>a.available))
  }

  getIndisponibili():Promise<iAuto[]>{
    return this.getAllCar()
    .then(res=>res.filter((a:iAuto)=>!a.available))
  }



  }













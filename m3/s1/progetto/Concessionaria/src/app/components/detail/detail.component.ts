import { ActivatedRoute, RouterModule } from '@angular/router';
import { Component } from '@angular/core';
import { iAuto } from '../../Models/auto';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrl: './detail.component.scss'
})
export class DetailComponent {
constructor (private router:ActivatedRoute){}

risultato:iAuto | undefined

ngOnInit(){
  this.router.params.subscribe((parametriDellaRotta:any)=> {
    const id = parametriDellaRotta.id
    this.getAllCar()
    .then(res=>res.find(auto =>auto.id === id))
    .then(res=>this.risultato=res)
  })


}

getAllCar():Promise<iAuto[]>{
  return fetch('../assets/db.json')
  .then (res => res.json())
  .then((res:iAuto[]) => res)
}

}

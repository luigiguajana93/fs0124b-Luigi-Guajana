import { Component } from '@angular/core';
import { iPhoto } from '../../Models/iphoto';
import { PhotoService } from '../../photo.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  photo:iPhoto[] = []
  arrLike:iPhoto[] =[]

  constructor(private photoSvc:PhotoService){}

ngOnInit(){
  this.photoSvc.$photo.subscribe(photo =>{
    this.photo = photo
  });
  this.photoSvc.$like.subscribe(arrLike =>{
    this.arrLike = arrLike
  });

}

canc(id:number){
  this.photoSvc.delete(id).subscribe()
}


like(id:number){
  this.photoSvc.addToLike(id)

}

}

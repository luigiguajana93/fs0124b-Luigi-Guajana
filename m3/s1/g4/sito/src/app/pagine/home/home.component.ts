import { Component } from '@angular/core';
import { iPost} from '../../Models/posts';
import { ServiceService } from '../../service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

postArr:iPost[] = [];

constructor(private postSvc:ServiceService){}

ngOnInit (){
  this.postSvc.getAllPost().then(res =>{
    this.postArr = res;
    
  })
}
}

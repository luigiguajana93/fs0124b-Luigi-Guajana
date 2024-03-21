import { Component } from '@angular/core';
import { ServiceService } from '../../service.service';
import { iPost } from '../../Models/posts';

@Component({
  selector: 'app-inactive-posts',
  templateUrl: './inactive-posts.component.html',
  styleUrl: './inactive-posts.component.scss'
})
export class InactivePostsComponent {

  postArr:iPost[] = [];
  constructor (private postSvc : ServiceService){}

  ngOnInit(){
    this.postSvc.getInactivePost().then(res=>{
      this.postArr = res;
    })
  }
}

import { Component } from '@angular/core';
import { ServiceService } from '../../service.service';
import { iPost } from '../../Models/posts';

@Component({
  selector: 'app-active-posts',
  templateUrl: './active-posts.component.html',
  styleUrl: './active-posts.component.scss'
})
export class ActivePostsComponent {

  postArr:iPost[] = [];
  constructor(private postSvc:ServiceService){}

  ngOnInit(){
    this.postSvc.getActivePost().then(res=>{
      this.postArr = res;
    })
  }
}

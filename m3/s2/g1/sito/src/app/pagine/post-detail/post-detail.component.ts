import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-post-detail',
  templateUrl: './post-detail.component.html',
  styleUrl: './post-detail.component.scss'
})
export class PostDetailComponent {

  constructor(private router:ActivatedRoute){}

ngOnInit(){
  this.router.params.subscribe((res:any) =>{

return res.id


})

}

}

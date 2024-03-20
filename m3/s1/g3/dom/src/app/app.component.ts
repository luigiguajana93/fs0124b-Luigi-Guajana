import { Component } from '@angular/core';
import { iPost } from './Models/posts';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {

  postsArr:iPost[] = [];

  ngOnInit (){

    fetch('../assets/db.json')
    .then(posts => posts.json())
    .then (post=>{
      this.postsArr = post.posts
      this.generaRandomArray()
  })
}

  generaNumero(){
  let randomIndex:number = Math.floor(Math.random()*this.postsArr.length);
    return randomIndex
  }

  randomArray:iPost[]  =[]

  generaRandomArray(){
    for(let i=0; i<4 ; i++){

      this.randomArray.push(this.postsArr[this.generaNumero()])
    }

  }



}

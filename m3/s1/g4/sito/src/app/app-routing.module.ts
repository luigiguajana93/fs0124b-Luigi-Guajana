import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pagine/home/home.component';
import { ActivePostsComponent } from './pagine/active-posts/active-posts.component';
import { InactivePostsComponent } from './pagine/inactive-posts/inactive-posts.component';
import { PostDetailComponent } from './pagine/post-detail/post-detail.component';

const routes: Routes = [
  {
    path:'',
    component:HomeComponent
  },
  {
    path:'active-posts',
    component:ActivePostsComponent
  },
  {
    path:'inactive-posts',
    component:InactivePostsComponent
  },
  {
    path:'post-detail',
    component:PostDetailComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

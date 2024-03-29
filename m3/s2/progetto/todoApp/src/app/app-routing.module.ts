import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { CompletedComponent } from './pages/completed/completed.component';
import { UncompletedComponent } from './pages/uncompleted/uncompleted.component';
import { TaskUserComponent } from './pages/task-user/task-user.component';

const routes: Routes = [
  {
    path:'',
    component:HomeComponent
  },
  {
    path:'completed',
    component:CompletedComponent
  },
  {
    path:'uncompleted',
    component:UncompletedComponent
  },
  {
    path:'taskUser',
    component:TaskUserComponent
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

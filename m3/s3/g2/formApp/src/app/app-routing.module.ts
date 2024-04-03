import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { FormStandardComponent } from './form-standard/form-standard.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';

const routes: Routes = [
  {
    path:'',
    component:HomeComponent
  },
  {
    path:'form-standard',
    component:FormStandardComponent
  },
  {
    path:'reactive-form',
    component:ReactiveFormComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

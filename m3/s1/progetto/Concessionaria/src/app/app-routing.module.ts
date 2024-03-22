import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AudiComponent } from './components/audi/audi.component';
import { FiatComponent } from './components/fiat/fiat.component';
import { FordComponent } from './components/ford/ford.component';
import { DetailComponent } from './components/detail/detail.component';
import { Pagina404Component } from './components/pagina404/pagina404.component';

const routes: Routes = [

  {
    path:'',
    component:HomeComponent
  },
  {
    path:'audi',
    component:AudiComponent
  },
  {
    path:'fiat',
    component:FiatComponent
  },
  {
    path:'ford',
    component:FordComponent
  },
  {
    path:'detail/:id',
    component:DetailComponent
  },
  {
    path:'**',
    component:Pagina404Component
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

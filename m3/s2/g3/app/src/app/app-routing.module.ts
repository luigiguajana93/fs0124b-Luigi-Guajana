import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { PreferComponent } from './pages/prefer/prefer.component';
import { ShoppingcartComponent } from './pages/shoppingcart/shoppingcart.component';

const routes: Routes = [
  {
    path:'',
  component:HomeComponent
  },
  {
    path:'pref',
  component:PreferComponent
  },
  {
    path:'shoppingcart',
  component:ShoppingcartComponent
  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

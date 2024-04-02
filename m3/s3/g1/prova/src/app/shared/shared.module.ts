import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BottoneComponent } from './bottone/bottone.component';



@NgModule({
  declarations: [
    BottoneComponent
  ],
  imports: [
    CommonModule
  ],
  exports:[
    BottoneComponent
  ]

})
export class SharedModule { }

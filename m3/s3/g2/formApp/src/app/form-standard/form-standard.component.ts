import { Component, ViewChild, } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form-standard',
  templateUrl: './form-standard.component.html',
  styleUrl: './form-standard.component.scss'
})
export class FormStandardComponent {

@ViewChild('f',{static:true}) form!:NgForm;

submit(form:NgForm){
  console.log(this.form.value)

}
}

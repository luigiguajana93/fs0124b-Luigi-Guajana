import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrl: './reactive-form.component.scss'
})
export class ReactiveFormComponent {
form!:FormGroup;

constructor(private fb:FormBuilder){}

ngOnInit(){
  this.form = this.fb.group({
    nome:this.fb.control(null,[Validators.required]),
    cognome:this.fb.control(null,[Validators.required]),
    authData: this.fb.group({
      email:this.fb.control(null,[Validators.required,Validators.email]),
      password:this.fb.control(null,Validators.required)
    })
  })
}

convalida(){
  console.log(this.form.value)
}







}



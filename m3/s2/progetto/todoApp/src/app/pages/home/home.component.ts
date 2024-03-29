import { TodoService } from './../../todo.service';
import { Component } from '@angular/core';
import { iTodo } from '../../Models/todo';
import { iUser } from '../../Models/user';
import { UserService } from '../../user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  userArr:iUser[] = [];
  taskArr:iTodo[] = [];
  constructor(private todoSvc:TodoService, private userSvc:UserService){}

  ngOnInit():void {
    this.taskArr = this.todoSvc.getAllTask();
    this.userArr = this.userSvc.getAllUser();

  }

  getUserById(userId:number): iUser | undefined{
    return this.userArr.find(user =>user.id === userId);
  }

  changeStatus(id:number){
    this.todoSvc.changeStatus(id)
  }
}

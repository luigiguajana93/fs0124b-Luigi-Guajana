import { Component } from '@angular/core';
import { iUser } from '../../Models/user';
import { iTodo } from '../../Models/todo';
import { TodoService } from '../../todo.service';
import { UserService } from '../../user.service';

@Component({
  selector: 'app-task-user',
  templateUrl: './task-user.component.html',
  styleUrl: './task-user.component.scss'
})
export class TaskUserComponent {
  userArr:iUser[] = [];
  taskArr:iTodo[] = [];
constructor(private todoSvc:TodoService, private userSvc:UserService){}

ngOnInit():void {
  this.taskArr = this.todoSvc.getAllTask();
  this.userArr = this.userSvc.getAllUser();
}

getByIdUser(id:number){
  return this.userArr.find(u => u.id === id)
}

getTasksOfUser(userId:number ):iTodo[] {
return this.todoSvc.getAllTask().filter(t =>t.userId === userId)
}

changeStatus(id:number){
  this.todoSvc.changeStatus(id)
}
}

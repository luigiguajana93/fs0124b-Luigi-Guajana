import { Component } from '@angular/core';
import { iTodo } from '../../Models/todo';
import { TodoService } from '../../todo.service';
import { iUser } from '../../Models/user';
import { UserService } from '../../user.service';

@Component({
  selector: 'app-completed',
  templateUrl: './completed.component.html',
  styleUrl: './completed.component.scss'
})
export class CompletedComponent {
  taskArr:iTodo[]=[];
  userArr:iUser[] = [];
  constructor(private todoSvc:TodoService,private userSvc:UserService){}

  ngOnInit(){
    this.taskArr=this.todoSvc.getCompletedTask()
    this.userArr = this.userSvc.getAllUser();

  }

  getUserById(userId:number): iUser | undefined{
    return this.userArr.find(user =>user.id === userId);
  }
}

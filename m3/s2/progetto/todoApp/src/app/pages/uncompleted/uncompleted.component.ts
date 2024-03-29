import { Component } from '@angular/core';
import { iTodo } from '../../Models/todo';
import { TodoService } from '../../todo.service';
import { iUser } from '../../Models/user';
import { UserService } from '../../user.service';

@Component({
  selector: 'app-uncompleted',
  templateUrl: './uncompleted.component.html',
  styleUrl: './uncompleted.component.scss'
})
export class UncompletedComponent {
  userArr:iUser[] = [];
  taskArr:iTodo[]=[];

  constructor(private todoSvc:TodoService,private userSvc:UserService){}


  ngOnInit(){
    this.taskArr=this.todoSvc.getUncompletedTask()
    this.userArr = this.userSvc.getAllUser();
  }

  getUserById(userId:number): iUser | undefined{
    return this.userArr.find(user =>user.id === userId);
  }

  
}

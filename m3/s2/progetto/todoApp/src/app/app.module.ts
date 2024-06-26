import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { NavbarComponent } from './pages/navbar/navbar.component';
import { CompletedComponent } from './pages/completed/completed.component';
import { UncompletedComponent } from './pages/uncompleted/uncompleted.component';
import { FormsModule } from '@angular/forms';
import { TaskUserComponent } from './pages/task-user/task-user.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    CompletedComponent,
    UncompletedComponent,
    TaskUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

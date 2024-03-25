import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pagine/home/home.component';
import { ActivePostsComponent } from './pagine/active-posts/active-posts.component';
import { InactivePostsComponent } from './pagine/inactive-posts/inactive-posts.component';
import { PostDetailComponent } from './pagine/post-detail/post-detail.component';
import { NavbarComponent } from './pagine/navbar/navbar.component';
import { Pagina404Component } from './pagine/pagina404/pagina404.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ActivePostsComponent,
    InactivePostsComponent,
    PostDetailComponent,
    NavbarComponent,
    Pagina404Component
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

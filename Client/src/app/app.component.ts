import { Component } from '@angular/core';
import * as firebase from 'firebase';
import { SpringService } from './spring.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'weekplan';
  constructor( private springServive :SpringService){
    
  }
  
  
}

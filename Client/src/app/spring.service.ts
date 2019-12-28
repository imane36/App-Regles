import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Regle } from './list/Regle';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SpringService {

  constructor(private http:HttpClient ,private router :Router ) { }
  baseUrl='http://localhost:8080' ;
 
get(){
  return this.http.get(this.baseUrl+'/regles') ;   
}
saveR(Regle:Object): Observable<Object>{
  console.log(Regle) ;
 return this.http.post(this.baseUrl+'/AddR',Regle) ;
}
deleteR(Regle:Object): Observable<any>{
  console.log(Regle) ;
  return this.http.post(this.baseUrl+'/deleteR',Regle) ;
}
deleteA(Attribut:Object): Observable<any>{
  console.log(Regle) ;
  return this.http.post(this.baseUrl+'/deleteA',Attribut) ;
}
saveA(Attribut:Object){
  console.log(Attribut) ;
  return this.http.post(this.baseUrl+'/AddA',Attribut) ;
}
getA(Regle:Object){
  console.log(Regle) ;
  return this.http.post(this.baseUrl+'/Attribut',Regle) ;

}

}